// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.GetClusterIstioServiceTelemetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterIstioServiceResult {
    private final String clusterName;
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String location;
    private final String name;
    private final @Nullable String project;
    private final String serviceId;
    private final String serviceName;
    private final String serviceNamespace;
    private final List<GetClusterIstioServiceTelemetry> telemetries;

    @OutputCustomType.Constructor({"clusterName","displayName","id","location","name","project","serviceId","serviceName","serviceNamespace","telemetries"})
    private GetClusterIstioServiceResult(
        String clusterName,
        String displayName,
        String id,
        String location,
        String name,
        @Nullable String project,
        String serviceId,
        String serviceName,
        String serviceNamespace,
        List<GetClusterIstioServiceTelemetry> telemetries) {
        this.clusterName = clusterName;
        this.displayName = displayName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceNamespace = serviceNamespace;
        this.telemetries = telemetries;
    }

    public String getClusterName() {
        return this.clusterName;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getServiceId() {
        return this.serviceId;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }
    public List<GetClusterIstioServiceTelemetry> getTelemetries() {
        return this.telemetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIstioServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String displayName;
        private String id;
        private String location;
        private String name;
        private @Nullable String project;
        private String serviceId;
        private String serviceName;
        private String serviceNamespace;
        private List<GetClusterIstioServiceTelemetry> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIstioServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.telemetries = defaults.telemetries;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }

        public Builder setTelemetries(List<GetClusterIstioServiceTelemetry> telemetries) {
            this.telemetries = Objects.requireNonNull(telemetries);
            return this;
        }
        public GetClusterIstioServiceResult build() {
            return new GetClusterIstioServiceResult(clusterName, displayName, id, location, name, project, serviceId, serviceName, serviceNamespace, telemetries);
        }
    }
}
