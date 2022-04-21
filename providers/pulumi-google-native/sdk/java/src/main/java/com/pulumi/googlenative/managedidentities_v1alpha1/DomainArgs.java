// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    @Import(name="auditLogsEnabled")
    private @Nullable Output<Boolean> auditLogsEnabled;

    public Optional<Output<Boolean>> auditLogsEnabled() {
        return Optional.ofNullable(this.auditLogsEnabled);
    }

    /**
     * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Network can be added using UpdateDomain later. Domain is only available on network part of authorized_networks. Caller needs to make sure that CIDR subnets do not overlap between networks, else domain creation will fail.
     * 
     */
    @Import(name="authorizedNetworks")
    private @Nullable Output<List<String>> authorizedNetworks;

    public Optional<Output<List<String>>> authorizedNetworks() {
        return Optional.ofNullable(this.authorizedNetworks);
    }

    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Optional. Resource labels to represent user provided metadata
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @Import(name="locations", required=true)
    private Output<List<String>> locations;

    public Output<List<String>> locations() {
        return this.locations;
    }

    /**
     * Optional. Name of customer-visible admin used to perform Active Directory operations. If not specified `setupadmin` would be used.
     * 
     */
    @Import(name="managedIdentitiesAdminName")
    private @Nullable Output<String> managedIdentitiesAdminName;

    public Optional<Output<String>> managedIdentitiesAdminName() {
        return Optional.ofNullable(this.managedIdentitiesAdminName);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    @Import(name="reservedIpRange", required=true)
    private Output<String> reservedIpRange;

    public Output<String> reservedIpRange() {
        return this.reservedIpRange;
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.auditLogsEnabled = $.auditLogsEnabled;
        this.authorizedNetworks = $.authorizedNetworks;
        this.domainName = $.domainName;
        this.labels = $.labels;
        this.locations = $.locations;
        this.managedIdentitiesAdminName = $.managedIdentitiesAdminName;
        this.project = $.project;
        this.reservedIpRange = $.reservedIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        public Builder auditLogsEnabled(@Nullable Output<Boolean> auditLogsEnabled) {
            $.auditLogsEnabled = auditLogsEnabled;
            return this;
        }

        public Builder auditLogsEnabled(Boolean auditLogsEnabled) {
            return auditLogsEnabled(Output.of(auditLogsEnabled));
        }

        public Builder authorizedNetworks(@Nullable Output<List<String>> authorizedNetworks) {
            $.authorizedNetworks = authorizedNetworks;
            return this;
        }

        public Builder authorizedNetworks(List<String> authorizedNetworks) {
            return authorizedNetworks(Output.of(authorizedNetworks));
        }

        public Builder authorizedNetworks(String... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder locations(Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public Builder managedIdentitiesAdminName(@Nullable Output<String> managedIdentitiesAdminName) {
            $.managedIdentitiesAdminName = managedIdentitiesAdminName;
            return this;
        }

        public Builder managedIdentitiesAdminName(String managedIdentitiesAdminName) {
            return managedIdentitiesAdminName(Output.of(managedIdentitiesAdminName));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder reservedIpRange(Output<String> reservedIpRange) {
            $.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder reservedIpRange(String reservedIpRange) {
            return reservedIpRange(Output.of(reservedIpRange));
        }

        public DomainArgs build() {
            $.locations = Objects.requireNonNull($.locations, "expected parameter 'locations' to be non-null");
            $.reservedIpRange = Objects.requireNonNull($.reservedIpRange, "expected parameter 'reservedIpRange' to be non-null");
            return $;
        }
    }

}
