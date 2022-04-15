// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointIscseArgs;
import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointManagementArgs;
import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointNfArgs;
import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointSmbArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OntapStorageVirtualMachineEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final OntapStorageVirtualMachineEndpointArgs Empty = new OntapStorageVirtualMachineEndpointArgs();

    /**
     * An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     * 
     */
    @Import(name="iscses")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointIscseArgs>> iscses;

    public Output<List<OntapStorageVirtualMachineEndpointIscseArgs>> iscses() {
        return this.iscses == null ? Codegen.empty() : this.iscses;
    }

    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    @Import(name="managements")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointManagementArgs>> managements;

    public Output<List<OntapStorageVirtualMachineEndpointManagementArgs>> managements() {
        return this.managements == null ? Codegen.empty() : this.managements;
    }

    /**
     * An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     * 
     */
    @Import(name="nfs")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointNfArgs>> nfs;

    public Output<List<OntapStorageVirtualMachineEndpointNfArgs>> nfs() {
        return this.nfs == null ? Codegen.empty() : this.nfs;
    }

    /**
     * An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
     * 
     */
    @Import(name="smbs")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointSmbArgs>> smbs;

    public Output<List<OntapStorageVirtualMachineEndpointSmbArgs>> smbs() {
        return this.smbs == null ? Codegen.empty() : this.smbs;
    }

    public OntapStorageVirtualMachineEndpointArgs(
        @Nullable Output<List<OntapStorageVirtualMachineEndpointIscseArgs>> iscses,
        @Nullable Output<List<OntapStorageVirtualMachineEndpointManagementArgs>> managements,
        @Nullable Output<List<OntapStorageVirtualMachineEndpointNfArgs>> nfs,
        @Nullable Output<List<OntapStorageVirtualMachineEndpointSmbArgs>> smbs) {
        this.iscses = iscses;
        this.managements = managements;
        this.nfs = nfs;
        this.smbs = smbs;
    }

    private OntapStorageVirtualMachineEndpointArgs() {
        this.iscses = Codegen.empty();
        this.managements = Codegen.empty();
        this.nfs = Codegen.empty();
        this.smbs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapStorageVirtualMachineEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointIscseArgs>> iscses;
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointManagementArgs>> managements;
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointNfArgs>> nfs;
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointSmbArgs>> smbs;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapStorageVirtualMachineEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iscses = defaults.iscses;
    	      this.managements = defaults.managements;
    	      this.nfs = defaults.nfs;
    	      this.smbs = defaults.smbs;
        }

        public Builder iscses(@Nullable Output<List<OntapStorageVirtualMachineEndpointIscseArgs>> iscses) {
            this.iscses = iscses;
            return this;
        }
        public Builder iscses(@Nullable List<OntapStorageVirtualMachineEndpointIscseArgs> iscses) {
            this.iscses = Codegen.ofNullable(iscses);
            return this;
        }
        public Builder iscses(OntapStorageVirtualMachineEndpointIscseArgs... iscses) {
            return iscses(List.of(iscses));
        }
        public Builder managements(@Nullable Output<List<OntapStorageVirtualMachineEndpointManagementArgs>> managements) {
            this.managements = managements;
            return this;
        }
        public Builder managements(@Nullable List<OntapStorageVirtualMachineEndpointManagementArgs> managements) {
            this.managements = Codegen.ofNullable(managements);
            return this;
        }
        public Builder managements(OntapStorageVirtualMachineEndpointManagementArgs... managements) {
            return managements(List.of(managements));
        }
        public Builder nfs(@Nullable Output<List<OntapStorageVirtualMachineEndpointNfArgs>> nfs) {
            this.nfs = nfs;
            return this;
        }
        public Builder nfs(@Nullable List<OntapStorageVirtualMachineEndpointNfArgs> nfs) {
            this.nfs = Codegen.ofNullable(nfs);
            return this;
        }
        public Builder nfs(OntapStorageVirtualMachineEndpointNfArgs... nfs) {
            return nfs(List.of(nfs));
        }
        public Builder smbs(@Nullable Output<List<OntapStorageVirtualMachineEndpointSmbArgs>> smbs) {
            this.smbs = smbs;
            return this;
        }
        public Builder smbs(@Nullable List<OntapStorageVirtualMachineEndpointSmbArgs> smbs) {
            this.smbs = Codegen.ofNullable(smbs);
            return this;
        }
        public Builder smbs(OntapStorageVirtualMachineEndpointSmbArgs... smbs) {
            return smbs(List.of(smbs));
        }        public OntapStorageVirtualMachineEndpointArgs build() {
            return new OntapStorageVirtualMachineEndpointArgs(iscses, managements, nfs, smbs);
        }
    }
}
