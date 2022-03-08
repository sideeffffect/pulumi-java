// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.KubernetesClusterInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.KubernetesRoleResourcesResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKubernetesRoleResult {
    /**
     * Host OS supported by the Kubernetes role.
     * 
     */
    private final String hostPlatform;
    /**
     * Platform where the runtime is hosted.
     * 
     */
    private final String hostPlatformType;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * Role type.
     * Expected value is 'Kubernetes'.
     * 
     */
    private final String kind;
    /**
     * Kubernetes cluster configuration
     * 
     */
    private final KubernetesClusterInfoResponse kubernetesClusterInfo;
    /**
     * Kubernetes role resources
     * 
     */
    private final KubernetesRoleResourcesResponse kubernetesRoleResources;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * State of Kubernetes deployment
     * 
     */
    private final String provisioningState;
    /**
     * Role status.
     * 
     */
    private final String roleStatus;
    /**
     * Role configured on ASE resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"hostPlatform","hostPlatformType","id","kind","kubernetesClusterInfo","kubernetesRoleResources","name","provisioningState","roleStatus","systemData","type"})
    private GetKubernetesRoleResult(
        String hostPlatform,
        String hostPlatformType,
        String id,
        String kind,
        KubernetesClusterInfoResponse kubernetesClusterInfo,
        KubernetesRoleResourcesResponse kubernetesRoleResources,
        String name,
        String provisioningState,
        String roleStatus,
        SystemDataResponse systemData,
        String type) {
        this.hostPlatform = hostPlatform;
        this.hostPlatformType = hostPlatformType;
        this.id = id;
        this.kind = kind;
        this.kubernetesClusterInfo = kubernetesClusterInfo;
        this.kubernetesRoleResources = kubernetesRoleResources;
        this.name = name;
        this.provisioningState = provisioningState;
        this.roleStatus = roleStatus;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Host OS supported by the Kubernetes role.
     * 
    */
    public String getHostPlatform() {
        return this.hostPlatform;
    }
    /**
     * Platform where the runtime is hosted.
     * 
    */
    public String getHostPlatformType() {
        return this.hostPlatformType;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Role type.
     * Expected value is 'Kubernetes'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Kubernetes cluster configuration
     * 
    */
    public KubernetesClusterInfoResponse getKubernetesClusterInfo() {
        return this.kubernetesClusterInfo;
    }
    /**
     * Kubernetes role resources
     * 
    */
    public KubernetesRoleResourcesResponse getKubernetesRoleResources() {
        return this.kubernetesRoleResources;
    }
    /**
     * The object name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of Kubernetes deployment
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Role status.
     * 
    */
    public String getRoleStatus() {
        return this.roleStatus;
    }
    /**
     * Role configured on ASE resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesRoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostPlatform;
        private String hostPlatformType;
        private String id;
        private String kind;
        private KubernetesClusterInfoResponse kubernetesClusterInfo;
        private KubernetesRoleResourcesResponse kubernetesRoleResources;
        private String name;
        private String provisioningState;
        private String roleStatus;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKubernetesRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPlatform = defaults.hostPlatform;
    	      this.hostPlatformType = defaults.hostPlatformType;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.kubernetesClusterInfo = defaults.kubernetesClusterInfo;
    	      this.kubernetesRoleResources = defaults.kubernetesRoleResources;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.roleStatus = defaults.roleStatus;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setHostPlatform(String hostPlatform) {
            this.hostPlatform = Objects.requireNonNull(hostPlatform);
            return this;
        }

        public Builder setHostPlatformType(String hostPlatformType) {
            this.hostPlatformType = Objects.requireNonNull(hostPlatformType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKubernetesClusterInfo(KubernetesClusterInfoResponse kubernetesClusterInfo) {
            this.kubernetesClusterInfo = Objects.requireNonNull(kubernetesClusterInfo);
            return this;
        }

        public Builder setKubernetesRoleResources(KubernetesRoleResourcesResponse kubernetesRoleResources) {
            this.kubernetesRoleResources = Objects.requireNonNull(kubernetesRoleResources);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRoleStatus(String roleStatus) {
            this.roleStatus = Objects.requireNonNull(roleStatus);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetKubernetesRoleResult build() {
            return new GetKubernetesRoleResult(hostPlatform, hostPlatformType, id, kind, kubernetesClusterInfo, kubernetesRoleResources, name, provisioningState, roleStatus, systemData, type);
        }
    }
}
