// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.inputs.TopicRuleAssetPropertyValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRulePutAssetPropertyValueEntryArgs extends ResourceArgs {

    public static final TopicRulePutAssetPropertyValueEntryArgs Empty = new TopicRulePutAssetPropertyValueEntryArgs();

    @Import(name="assetId")
    private @Nullable Output<String> assetId;

    public Optional<Output<String>> assetId() {
        return Optional.ofNullable(this.assetId);
    }

    @Import(name="entryId")
    private @Nullable Output<String> entryId;

    public Optional<Output<String>> entryId() {
        return Optional.ofNullable(this.entryId);
    }

    @Import(name="propertyAlias")
    private @Nullable Output<String> propertyAlias;

    public Optional<Output<String>> propertyAlias() {
        return Optional.ofNullable(this.propertyAlias);
    }

    @Import(name="propertyId")
    private @Nullable Output<String> propertyId;

    public Optional<Output<String>> propertyId() {
        return Optional.ofNullable(this.propertyId);
    }

    @Import(name="propertyValues", required=true)
    private Output<List<TopicRuleAssetPropertyValueArgs>> propertyValues;

    public Output<List<TopicRuleAssetPropertyValueArgs>> propertyValues() {
        return this.propertyValues;
    }

    private TopicRulePutAssetPropertyValueEntryArgs() {}

    private TopicRulePutAssetPropertyValueEntryArgs(TopicRulePutAssetPropertyValueEntryArgs $) {
        this.assetId = $.assetId;
        this.entryId = $.entryId;
        this.propertyAlias = $.propertyAlias;
        this.propertyId = $.propertyId;
        this.propertyValues = $.propertyValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRulePutAssetPropertyValueEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRulePutAssetPropertyValueEntryArgs $;

        public Builder() {
            $ = new TopicRulePutAssetPropertyValueEntryArgs();
        }

        public Builder(TopicRulePutAssetPropertyValueEntryArgs defaults) {
            $ = new TopicRulePutAssetPropertyValueEntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder assetId(@Nullable Output<String> assetId) {
            $.assetId = assetId;
            return this;
        }

        public Builder assetId(String assetId) {
            return assetId(Output.of(assetId));
        }

        public Builder entryId(@Nullable Output<String> entryId) {
            $.entryId = entryId;
            return this;
        }

        public Builder entryId(String entryId) {
            return entryId(Output.of(entryId));
        }

        public Builder propertyAlias(@Nullable Output<String> propertyAlias) {
            $.propertyAlias = propertyAlias;
            return this;
        }

        public Builder propertyAlias(String propertyAlias) {
            return propertyAlias(Output.of(propertyAlias));
        }

        public Builder propertyId(@Nullable Output<String> propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public Builder propertyId(String propertyId) {
            return propertyId(Output.of(propertyId));
        }

        public Builder propertyValues(Output<List<TopicRuleAssetPropertyValueArgs>> propertyValues) {
            $.propertyValues = propertyValues;
            return this;
        }

        public Builder propertyValues(List<TopicRuleAssetPropertyValueArgs> propertyValues) {
            return propertyValues(Output.of(propertyValues));
        }

        public Builder propertyValues(TopicRuleAssetPropertyValueArgs... propertyValues) {
            return propertyValues(List.of(propertyValues));
        }

        public TopicRulePutAssetPropertyValueEntryArgs build() {
            $.propertyValues = Objects.requireNonNull($.propertyValues, "expected parameter 'propertyValues' to be non-null");
            return $;
        }
    }

}
