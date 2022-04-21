// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.enums.IndexOrder;
import com.pulumi.awsnative.kendra.inputs.IndexValueImportanceItem;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexRelevance extends com.pulumi.resources.InvokeArgs {

    public static final IndexRelevance Empty = new IndexRelevance();

    @Import(name="duration")
    private @Nullable String duration;

    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="freshness")
    private @Nullable Boolean freshness;

    public Optional<Boolean> freshness() {
        return Optional.ofNullable(this.freshness);
    }

    @Import(name="importance")
    private @Nullable Integer importance;

    public Optional<Integer> importance() {
        return Optional.ofNullable(this.importance);
    }

    @Import(name="rankOrder")
    private @Nullable IndexOrder rankOrder;

    public Optional<IndexOrder> rankOrder() {
        return Optional.ofNullable(this.rankOrder);
    }

    @Import(name="valueImportanceItems")
    private @Nullable List<IndexValueImportanceItem> valueImportanceItems;

    public Optional<List<IndexValueImportanceItem>> valueImportanceItems() {
        return Optional.ofNullable(this.valueImportanceItems);
    }

    private IndexRelevance() {}

    private IndexRelevance(IndexRelevance $) {
        this.duration = $.duration;
        this.freshness = $.freshness;
        this.importance = $.importance;
        this.rankOrder = $.rankOrder;
        this.valueImportanceItems = $.valueImportanceItems;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexRelevance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexRelevance $;

        public Builder() {
            $ = new IndexRelevance();
        }

        public Builder(IndexRelevance defaults) {
            $ = new IndexRelevance(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable String duration) {
            $.duration = duration;
            return this;
        }

        public Builder freshness(@Nullable Boolean freshness) {
            $.freshness = freshness;
            return this;
        }

        public Builder importance(@Nullable Integer importance) {
            $.importance = importance;
            return this;
        }

        public Builder rankOrder(@Nullable IndexOrder rankOrder) {
            $.rankOrder = rankOrder;
            return this;
        }

        public Builder valueImportanceItems(@Nullable List<IndexValueImportanceItem> valueImportanceItems) {
            $.valueImportanceItems = valueImportanceItems;
            return this;
        }

        public Builder valueImportanceItems(IndexValueImportanceItem... valueImportanceItems) {
            return valueImportanceItems(List.of(valueImportanceItems));
        }

        public IndexRelevance build() {
            return $;
        }
    }

}
