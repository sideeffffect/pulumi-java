// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Istio service scoped to a single Kubernetes cluster. Learn more at https://istio.io. Clusters running OSS Istio will have their services ingested as this type.
 * 
 */
public final class ClusterIstioResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterIstioResponse Empty = new ClusterIstioResponse();

    /**
     * The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the cluster_name resource label in k8s_cluster resources.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to the location resource label in k8s_cluster resources.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    /**
     * The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    /**
     * The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
     */
    @Import(name="serviceNamespace", required=true)
      private final String serviceNamespace;

    public String serviceNamespace() {
        return this.serviceNamespace;
    }

    public ClusterIstioResponse(
        String clusterName,
        String location,
        String serviceName,
        String serviceNamespace) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
    }

    private ClusterIstioResponse() {
        this.clusterName = null;
        this.location = null;
        this.serviceName = null;
        this.serviceNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIstioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String location;
        private String serviceName;
        private String serviceNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIstioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.location = defaults.location;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }        public ClusterIstioResponse build() {
            return new ClusterIstioResponse(clusterName, location, serviceName, serviceNamespace);
        }
    }
}
