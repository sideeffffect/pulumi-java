// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.ContainerConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.DataDiskResponse;
import io.pulumi.azurenative.batch.outputs.DiskEncryptionConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.ImageReferenceResponse;
import io.pulumi.azurenative.batch.outputs.NodePlacementConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.VMExtensionResponse;
import io.pulumi.azurenative.batch.outputs.WindowsConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineConfigurationResponse {
    /**
     * If specified, setup is performed on each node in the pool to allow tasks to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings property, and all other tasks may specify it.
     * 
     */
    private final @Nullable ContainerConfigurationResponse containerConfiguration;
    /**
     * This property must be specified if the compute nodes in the pool need to have empty data disks attached to them.
     * 
     */
    private final @Nullable List<DataDiskResponse> dataDisks;
    /**
     * If specified, encryption is performed on each node in the pool during node provisioning.
     * 
     */
    private final @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
    /**
     * If specified, the extensions mentioned in this configuration will be installed on each node.
     * 
     */
    private final @Nullable List<VMExtensionResponse> extensions;
    private final ImageReferenceResponse imageReference;
    /**
     * This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are:
     * 
     *  Windows_Server - The on-premises license is for Windows Server.
     *  Windows_Client - The on-premises license is for Windows Client.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * The Batch node agent is a program that runs on each node in the pool, and provides the command-and-control interface between the node and the Batch service. There are different implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their list of verified image references, see the 'List supported node agent SKUs' operation.
     * 
     */
    private final String nodeAgentSkuId;
    /**
     * This configuration will specify rules on how nodes in the pool will be physically allocated.
     * 
     */
    private final @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration;
    /**
     * This property must not be specified if the imageReference specifies a Linux OS image.
     * 
     */
    private final @Nullable WindowsConfigurationResponse windowsConfiguration;

    @OutputCustomType.Constructor
    private VirtualMachineConfigurationResponse(
        @OutputCustomType.Parameter("containerConfiguration") @Nullable ContainerConfigurationResponse containerConfiguration,
        @OutputCustomType.Parameter("dataDisks") @Nullable List<DataDiskResponse> dataDisks,
        @OutputCustomType.Parameter("diskEncryptionConfiguration") @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration,
        @OutputCustomType.Parameter("extensions") @Nullable List<VMExtensionResponse> extensions,
        @OutputCustomType.Parameter("imageReference") ImageReferenceResponse imageReference,
        @OutputCustomType.Parameter("licenseType") @Nullable String licenseType,
        @OutputCustomType.Parameter("nodeAgentSkuId") String nodeAgentSkuId,
        @OutputCustomType.Parameter("nodePlacementConfiguration") @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration,
        @OutputCustomType.Parameter("windowsConfiguration") @Nullable WindowsConfigurationResponse windowsConfiguration) {
        this.containerConfiguration = containerConfiguration;
        this.dataDisks = dataDisks;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.extensions = extensions;
        this.imageReference = imageReference;
        this.licenseType = licenseType;
        this.nodeAgentSkuId = nodeAgentSkuId;
        this.nodePlacementConfiguration = nodePlacementConfiguration;
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * If specified, setup is performed on each node in the pool to allow tasks to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings property, and all other tasks may specify it.
     * 
    */
    public Optional<ContainerConfigurationResponse> getContainerConfiguration() {
        return Optional.ofNullable(this.containerConfiguration);
    }
    /**
     * This property must be specified if the compute nodes in the pool need to have empty data disks attached to them.
     * 
    */
    public List<DataDiskResponse> getDataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }
    /**
     * If specified, encryption is performed on each node in the pool during node provisioning.
     * 
    */
    public Optional<DiskEncryptionConfigurationResponse> getDiskEncryptionConfiguration() {
        return Optional.ofNullable(this.diskEncryptionConfiguration);
    }
    /**
     * If specified, the extensions mentioned in this configuration will be installed on each node.
     * 
    */
    public List<VMExtensionResponse> getExtensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }
    public ImageReferenceResponse getImageReference() {
        return this.imageReference;
    }
    /**
     * This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are:
     * 
     *  Windows_Server - The on-premises license is for Windows Server.
     *  Windows_Client - The on-premises license is for Windows Client.
     * 
    */
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * The Batch node agent is a program that runs on each node in the pool, and provides the command-and-control interface between the node and the Batch service. There are different implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their list of verified image references, see the 'List supported node agent SKUs' operation.
     * 
    */
    public String getNodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }
    /**
     * This configuration will specify rules on how nodes in the pool will be physically allocated.
     * 
    */
    public Optional<NodePlacementConfigurationResponse> getNodePlacementConfiguration() {
        return Optional.ofNullable(this.nodePlacementConfiguration);
    }
    /**
     * This property must not be specified if the imageReference specifies a Linux OS image.
     * 
    */
    public Optional<WindowsConfigurationResponse> getWindowsConfiguration() {
        return Optional.ofNullable(this.windowsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerConfigurationResponse containerConfiguration;
        private @Nullable List<DataDiskResponse> dataDisks;
        private @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
        private @Nullable List<VMExtensionResponse> extensions;
        private ImageReferenceResponse imageReference;
        private @Nullable String licenseType;
        private String nodeAgentSkuId;
        private @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration;
        private @Nullable WindowsConfigurationResponse windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerConfiguration = defaults.containerConfiguration;
    	      this.dataDisks = defaults.dataDisks;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.extensions = defaults.extensions;
    	      this.imageReference = defaults.imageReference;
    	      this.licenseType = defaults.licenseType;
    	      this.nodeAgentSkuId = defaults.nodeAgentSkuId;
    	      this.nodePlacementConfiguration = defaults.nodePlacementConfiguration;
    	      this.windowsConfiguration = defaults.windowsConfiguration;
        }

        public Builder containerConfiguration(@Nullable ContainerConfigurationResponse containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        public Builder dataDisks(@Nullable List<DataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder diskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }

        public Builder extensions(@Nullable List<VMExtensionResponse> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder imageReference(ImageReferenceResponse imageReference) {
            this.imageReference = Objects.requireNonNull(imageReference);
            return this;
        }

        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder nodeAgentSkuId(String nodeAgentSkuId) {
            this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId);
            return this;
        }

        public Builder nodePlacementConfiguration(@Nullable NodePlacementConfigurationResponse nodePlacementConfiguration) {
            this.nodePlacementConfiguration = nodePlacementConfiguration;
            return this;
        }

        public Builder windowsConfiguration(@Nullable WindowsConfigurationResponse windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }
        public VirtualMachineConfigurationResponse build() {
            return new VirtualMachineConfigurationResponse(containerConfiguration, dataDisks, diskEncryptionConfiguration, extensions, imageReference, licenseType, nodeAgentSkuId, nodePlacementConfiguration, windowsConfiguration);
        }
    }
}
