// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.activedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * The name of delegated administrator account used to perform Active Directory operations.
     * If not specified, setupadmin will be used.
     * 
     */
    @InputImport(name="admin")
      private final @Nullable Input<String> admin;

    public Input<String> getAdmin() {
        return this.admin == null ? Input.empty() : this.admin;
    }

    /**
     * The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
     * If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    @InputImport(name="authorizedNetworks")
      private final @Nullable Input<List<String>> authorizedNetworks;

    public Input<List<String>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Input.empty() : this.authorizedNetworks;
    }

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Resource labels that can contain user-provided metadata
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
     * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @InputImport(name="locations", required=true)
      private final Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger.
     * Ranges must be unique and non-overlapping with existing subnets in authorizedNetworks
     * 
     */
    @InputImport(name="reservedIpRange", required=true)
      private final Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange;
    }

    public DomainArgs(
        @Nullable Input<String> admin,
        @Nullable Input<List<String>> authorizedNetworks,
        Input<String> domainName,
        @Nullable Input<Map<String,String>> labels,
        Input<List<String>> locations,
        @Nullable Input<String> project,
        Input<String> reservedIpRange) {
        this.admin = admin;
        this.authorizedNetworks = authorizedNetworks;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.labels = labels;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.project = project;
        this.reservedIpRange = Objects.requireNonNull(reservedIpRange, "expected parameter 'reservedIpRange' to be non-null");
    }

    private DomainArgs() {
        this.admin = Input.empty();
        this.authorizedNetworks = Input.empty();
        this.domainName = Input.empty();
        this.labels = Input.empty();
        this.locations = Input.empty();
        this.project = Input.empty();
        this.reservedIpRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> admin;
        private @Nullable Input<List<String>> authorizedNetworks;
        private Input<String> domainName;
        private @Nullable Input<Map<String,String>> labels;
        private Input<List<String>> locations;
        private @Nullable Input<String> project;
        private Input<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.domainName = defaults.domainName;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.project = defaults.project;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder admin(@Nullable Input<String> admin) {
            this.admin = admin;
            return this;
        }

        public Builder admin(@Nullable String admin) {
            this.admin = Input.ofNullable(admin);
            return this;
        }

        public Builder authorizedNetworks(@Nullable Input<List<String>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }

        public Builder authorizedNetworks(@Nullable List<String> authorizedNetworks) {
            this.authorizedNetworks = Input.ofNullable(authorizedNetworks);
            return this;
        }

        public Builder domainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder locations(Input<List<String>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder locations(List<String> locations) {
            this.locations = Input.of(Objects.requireNonNull(locations));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder reservedIpRange(Input<String> reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }

        public Builder reservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Input.of(Objects.requireNonNull(reservedIpRange));
            return this;
        }
        public DomainArgs build() {
            return new DomainArgs(admin, authorizedNetworks, domainName, labels, locations, project, reservedIpRange);
        }
    }
}
