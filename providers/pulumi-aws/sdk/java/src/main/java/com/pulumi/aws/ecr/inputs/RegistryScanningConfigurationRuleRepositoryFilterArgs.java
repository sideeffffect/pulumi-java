// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RegistryScanningConfigurationRuleRepositoryFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryScanningConfigurationRuleRepositoryFilterArgs Empty = new RegistryScanningConfigurationRuleRepositoryFilterArgs();

    @Import(name="filter", required=true)
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    @Import(name="filterType", required=true)
    private Output<String> filterType;

    public Output<String> filterType() {
        return this.filterType;
    }

    private RegistryScanningConfigurationRuleRepositoryFilterArgs() {}

    private RegistryScanningConfigurationRuleRepositoryFilterArgs(RegistryScanningConfigurationRuleRepositoryFilterArgs $) {
        this.filter = $.filter;
        this.filterType = $.filterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryScanningConfigurationRuleRepositoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryScanningConfigurationRuleRepositoryFilterArgs $;

        public Builder() {
            $ = new RegistryScanningConfigurationRuleRepositoryFilterArgs();
        }

        public Builder(RegistryScanningConfigurationRuleRepositoryFilterArgs defaults) {
            $ = new RegistryScanningConfigurationRuleRepositoryFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder filterType(Output<String> filterType) {
            $.filterType = filterType;
            return this;
        }

        public Builder filterType(String filterType) {
            return filterType(Output.of(filterType));
        }

        public RegistryScanningConfigurationRuleRepositoryFilterArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.filterType = Objects.requireNonNull($.filterType, "expected parameter 'filterType' to be non-null");
            return $;
        }
    }

}
