// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.RegionHealthCheckServiceHealthStatusAggregationPolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionHealthCheckServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckServiceArgs Empty = new RegionHealthCheckServiceArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT or portSpecification=USE_FIXED_PORT. For regional HealthCheckService, the HealthCheck must be regional and in the same region. For global HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks must belong to the same region as zones of NEGs.
     * 
     */
    @Import(name="healthChecks")
    private @Nullable Output<List<String>> healthChecks;

    public Optional<Output<List<String>>> healthChecks() {
        return Optional.ofNullable(this.healthChecks);
    }

    /**
     * Optional. Policy for how the results from multiple health checks for the same endpoint are aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth message is returned for each pair in the health check service. - AND. If any health check of an endpoint reports UNHEALTHY, then UNHEALTHY is the HealthState of the endpoint. If all health checks report HEALTHY, the HealthState of the endpoint is HEALTHY. .
     * 
     */
    @Import(name="healthStatusAggregationPolicy")
    private @Nullable Output<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy;

    public Optional<Output<RegionHealthCheckServiceHealthStatusAggregationPolicy>> healthStatusAggregationPolicy() {
        return Optional.ofNullable(this.healthStatusAggregationPolicy);
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
     * 
     */
    @Import(name="networkEndpointGroups")
    private @Nullable Output<List<String>> networkEndpointGroups;

    public Optional<Output<List<String>>> networkEndpointGroups() {
        return Optional.ofNullable(this.networkEndpointGroups);
    }

    /**
     * A list of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of endpoints for receiving notifications of change in health status. For regional HealthCheckService, NotificationEndpoint must be regional and in the same region. For global HealthCheckService, NotificationEndpoint must be global.
     * 
     */
    @Import(name="notificationEndpoints")
    private @Nullable Output<List<String>> notificationEndpoints;

    public Optional<Output<List<String>>> notificationEndpoints() {
        return Optional.ofNullable(this.notificationEndpoints);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private RegionHealthCheckServiceArgs() {}

    private RegionHealthCheckServiceArgs(RegionHealthCheckServiceArgs $) {
        this.description = $.description;
        this.healthChecks = $.healthChecks;
        this.healthStatusAggregationPolicy = $.healthStatusAggregationPolicy;
        this.name = $.name;
        this.networkEndpointGroups = $.networkEndpointGroups;
        this.notificationEndpoints = $.notificationEndpoints;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionHealthCheckServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionHealthCheckServiceArgs $;

        public Builder() {
            $ = new RegionHealthCheckServiceArgs();
        }

        public Builder(RegionHealthCheckServiceArgs defaults) {
            $ = new RegionHealthCheckServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder healthChecks(@Nullable Output<List<String>> healthChecks) {
            $.healthChecks = healthChecks;
            return this;
        }

        public Builder healthChecks(List<String> healthChecks) {
            return healthChecks(Output.of(healthChecks));
        }

        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }

        public Builder healthStatusAggregationPolicy(@Nullable Output<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy) {
            $.healthStatusAggregationPolicy = healthStatusAggregationPolicy;
            return this;
        }

        public Builder healthStatusAggregationPolicy(RegionHealthCheckServiceHealthStatusAggregationPolicy healthStatusAggregationPolicy) {
            return healthStatusAggregationPolicy(Output.of(healthStatusAggregationPolicy));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkEndpointGroups(@Nullable Output<List<String>> networkEndpointGroups) {
            $.networkEndpointGroups = networkEndpointGroups;
            return this;
        }

        public Builder networkEndpointGroups(List<String> networkEndpointGroups) {
            return networkEndpointGroups(Output.of(networkEndpointGroups));
        }

        public Builder networkEndpointGroups(String... networkEndpointGroups) {
            return networkEndpointGroups(List.of(networkEndpointGroups));
        }

        public Builder notificationEndpoints(@Nullable Output<List<String>> notificationEndpoints) {
            $.notificationEndpoints = notificationEndpoints;
            return this;
        }

        public Builder notificationEndpoints(List<String> notificationEndpoints) {
            return notificationEndpoints(Output.of(notificationEndpoints));
        }

        public Builder notificationEndpoints(String... notificationEndpoints) {
            return notificationEndpoints(List.of(notificationEndpoints));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public RegionHealthCheckServiceArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
