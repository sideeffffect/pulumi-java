// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryGetArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryGetArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeRegexGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionStoredInfoTypeState extends com.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeState Empty = new PreventionStoredInfoTypeState();

    /**
     * A description of the info type.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="dictionary")
    private @Nullable Output<PreventionStoredInfoTypeDictionaryGetArgs> dictionary;

    public Optional<Output<PreventionStoredInfoTypeDictionaryGetArgs>> dictionary() {
        return Optional.ofNullable(this.dictionary);
    }

    /**
     * User set display name of the info type.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="largeCustomDictionary")
    private @Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs> largeCustomDictionary;

    public Optional<Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs>> largeCustomDictionary() {
        return Optional.ofNullable(this.largeCustomDictionary);
    }

    /**
     * Name describing the field.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parent of the info type in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<PreventionStoredInfoTypeRegexGetArgs> regex;

    public Optional<Output<PreventionStoredInfoTypeRegexGetArgs>> regex() {
        return Optional.ofNullable(this.regex);
    }

    private PreventionStoredInfoTypeState() {}

    private PreventionStoredInfoTypeState(PreventionStoredInfoTypeState $) {
        this.description = $.description;
        this.dictionary = $.dictionary;
        this.displayName = $.displayName;
        this.largeCustomDictionary = $.largeCustomDictionary;
        this.name = $.name;
        this.parent = $.parent;
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionStoredInfoTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeState $;

        public Builder() {
            $ = new PreventionStoredInfoTypeState();
        }

        public Builder(PreventionStoredInfoTypeState defaults) {
            $ = new PreventionStoredInfoTypeState(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder dictionary(@Nullable Output<PreventionStoredInfoTypeDictionaryGetArgs> dictionary) {
            $.dictionary = dictionary;
            return this;
        }

        public Builder dictionary(PreventionStoredInfoTypeDictionaryGetArgs dictionary) {
            return dictionary(Output.of(dictionary));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder largeCustomDictionary(@Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs> largeCustomDictionary) {
            $.largeCustomDictionary = largeCustomDictionary;
            return this;
        }

        public Builder largeCustomDictionary(PreventionStoredInfoTypeLargeCustomDictionaryGetArgs largeCustomDictionary) {
            return largeCustomDictionary(Output.of(largeCustomDictionary));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder regex(@Nullable Output<PreventionStoredInfoTypeRegexGetArgs> regex) {
            $.regex = regex;
            return this;
        }

        public Builder regex(PreventionStoredInfoTypeRegexGetArgs regex) {
            return regex(Output.of(regex));
        }

        public PreventionStoredInfoTypeState build() {
            return $;
        }
    }

}
