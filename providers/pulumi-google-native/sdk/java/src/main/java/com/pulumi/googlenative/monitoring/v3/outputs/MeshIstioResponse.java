// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MeshIstioResponse {
    /**
     * @return Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics.
     * 
     */
    private final String meshUid;
    /**
     * @return The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
     * 
     */
    private final String serviceName;
    /**
     * @return The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
     */
    private final String serviceNamespace;

    @CustomType.Constructor
    private MeshIstioResponse(
        @CustomType.Parameter("meshUid") String meshUid,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("serviceNamespace") String serviceNamespace) {
        this.meshUid = meshUid;
        this.serviceName = serviceName;
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * @return Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics.
     * 
     */
    public String meshUid() {
        return this.meshUid;
    }
    /**
     * @return The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
     */
    public String serviceNamespace() {
        return this.serviceNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshIstioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String meshUid;
        private String serviceName;
        private String serviceNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshIstioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshUid = defaults.meshUid;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
        }

        public Builder meshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }        public MeshIstioResponse build() {
            return new MeshIstioResponse(meshUid, serviceName, serviceNamespace);
        }
    }
}
