// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxEntityTypeEntityArgs extends ResourceArgs {

    public static final CxEntityTypeEntityArgs Empty = new CxEntityTypeEntityArgs();

    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
     * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
     * 
     */
    @Import(name="synonyms")
    private @Nullable Output<List<String>> synonyms;

    /**
     * @return A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
     * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
     * 
     */
    public Optional<Output<List<String>>> synonyms() {
        return Optional.ofNullable(this.synonyms);
    }

    /**
     * The word or phrase to be excluded.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The word or phrase to be excluded.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CxEntityTypeEntityArgs() {}

    private CxEntityTypeEntityArgs(CxEntityTypeEntityArgs $) {
        this.synonyms = $.synonyms;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxEntityTypeEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxEntityTypeEntityArgs $;

        public Builder() {
            $ = new CxEntityTypeEntityArgs();
        }

        public Builder(CxEntityTypeEntityArgs defaults) {
            $ = new CxEntityTypeEntityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param synonyms A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
         * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(@Nullable Output<List<String>> synonyms) {
            $.synonyms = synonyms;
            return this;
        }

        /**
         * @param synonyms A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
         * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(List<String> synonyms) {
            return synonyms(Output.of(synonyms));
        }

        /**
         * @param synonyms A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
         * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }

        /**
         * @param value The word or phrase to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The word or phrase to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CxEntityTypeEntityArgs build() {
            return $;
        }
    }

}
