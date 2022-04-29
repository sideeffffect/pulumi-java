// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2;

import com.pulumi.awsnative.inspectorv2.enums.FilterAction;
import com.pulumi.awsnative.inspectorv2.inputs.FilterCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterArgs extends ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * Findings filter description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Findings filter description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Findings filter action.
     * 
     */
    @Import(name="filterAction", required=true)
    private Output<FilterAction> filterAction;

    /**
     * @return Findings filter action.
     * 
     */
    public Output<FilterAction> filterAction() {
        return this.filterAction;
    }

    /**
     * Findings filter criteria.
     * 
     */
    @Import(name="filterCriteria", required=true)
    private Output<FilterCriteriaArgs> filterCriteria;

    /**
     * @return Findings filter criteria.
     * 
     */
    public Output<FilterCriteriaArgs> filterCriteria() {
        return this.filterCriteria;
    }

    /**
     * Findings filter name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Findings filter name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FilterArgs() {}

    private FilterArgs(FilterArgs $) {
        this.description = $.description;
        this.filterAction = $.filterAction;
        this.filterCriteria = $.filterCriteria;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterArgs $;

        public Builder() {
            $ = new FilterArgs();
        }

        public Builder(FilterArgs defaults) {
            $ = new FilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Findings filter description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Findings filter description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filterAction Findings filter action.
         * 
         * @return builder
         * 
         */
        public Builder filterAction(Output<FilterAction> filterAction) {
            $.filterAction = filterAction;
            return this;
        }

        /**
         * @param filterAction Findings filter action.
         * 
         * @return builder
         * 
         */
        public Builder filterAction(FilterAction filterAction) {
            return filterAction(Output.of(filterAction));
        }

        /**
         * @param filterCriteria Findings filter criteria.
         * 
         * @return builder
         * 
         */
        public Builder filterCriteria(Output<FilterCriteriaArgs> filterCriteria) {
            $.filterCriteria = filterCriteria;
            return this;
        }

        /**
         * @param filterCriteria Findings filter criteria.
         * 
         * @return builder
         * 
         */
        public Builder filterCriteria(FilterCriteriaArgs filterCriteria) {
            return filterCriteria(Output.of(filterCriteria));
        }

        /**
         * @param name Findings filter name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Findings filter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FilterArgs build() {
            $.filterAction = Objects.requireNonNull($.filterAction, "expected parameter 'filterAction' to be non-null");
            $.filterCriteria = Objects.requireNonNull($.filterCriteria, "expected parameter 'filterCriteria' to be non-null");
            return $;
        }
    }

}
