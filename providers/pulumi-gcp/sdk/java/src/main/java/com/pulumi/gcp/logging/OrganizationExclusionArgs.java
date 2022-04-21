// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationExclusionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationExclusionArgs Empty = new OrganizationExclusionArgs();

    /**
     * A human-readable description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    /**
     * The name of the logging exclusion.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization to create the exclusion in.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    private OrganizationExclusionArgs() {}

    private OrganizationExclusionArgs(OrganizationExclusionArgs $) {
        this.description = $.description;
        this.disabled = $.disabled;
        this.filter = $.filter;
        this.name = $.name;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationExclusionArgs $;

        public Builder() {
            $ = new OrganizationExclusionArgs();
        }

        public Builder(OrganizationExclusionArgs defaults) {
            $ = new OrganizationExclusionArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public OrganizationExclusionArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            return $;
        }
    }

}
