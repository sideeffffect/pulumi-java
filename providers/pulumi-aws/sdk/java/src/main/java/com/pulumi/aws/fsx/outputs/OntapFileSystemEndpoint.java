// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.aws.fsx.outputs.OntapFileSystemEndpointIntercluster;
import com.pulumi.aws.fsx.outputs.OntapFileSystemEndpointManagement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OntapFileSystemEndpoint {
    /**
     * @return An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems. See Endpoint.
     * 
     */
    private final @Nullable List<OntapFileSystemEndpointIntercluster> interclusters;
    /**
     * @return An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    private final @Nullable List<OntapFileSystemEndpointManagement> managements;

    @CustomType.Constructor
    private OntapFileSystemEndpoint(
        @CustomType.Parameter("interclusters") @Nullable List<OntapFileSystemEndpointIntercluster> interclusters,
        @CustomType.Parameter("managements") @Nullable List<OntapFileSystemEndpointManagement> managements) {
        this.interclusters = interclusters;
        this.managements = managements;
    }

    /**
     * @return An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems. See Endpoint.
     * 
     */
    public List<OntapFileSystemEndpointIntercluster> interclusters() {
        return this.interclusters == null ? List.of() : this.interclusters;
    }
    /**
     * @return An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    public List<OntapFileSystemEndpointManagement> managements() {
        return this.managements == null ? List.of() : this.managements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OntapFileSystemEndpointIntercluster> interclusters;
        private @Nullable List<OntapFileSystemEndpointManagement> managements;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interclusters = defaults.interclusters;
    	      this.managements = defaults.managements;
        }

        public Builder interclusters(@Nullable List<OntapFileSystemEndpointIntercluster> interclusters) {
            this.interclusters = interclusters;
            return this;
        }
        public Builder interclusters(OntapFileSystemEndpointIntercluster... interclusters) {
            return interclusters(List.of(interclusters));
        }
        public Builder managements(@Nullable List<OntapFileSystemEndpointManagement> managements) {
            this.managements = managements;
            return this;
        }
        public Builder managements(OntapFileSystemEndpointManagement... managements) {
            return managements(List.of(managements));
        }        public OntapFileSystemEndpoint build() {
            return new OntapFileSystemEndpoint(interclusters, managements);
        }
    }
}
