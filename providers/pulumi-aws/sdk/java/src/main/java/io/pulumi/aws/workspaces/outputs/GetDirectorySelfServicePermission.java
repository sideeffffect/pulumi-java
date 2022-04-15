// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetDirectorySelfServicePermission {
    /**
     * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace.
     * 
     */
    private final Boolean changeComputeType;
    /**
     * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace.
     * 
     */
    private final Boolean increaseVolumeSize;
    /**
     * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state.
     * 
     */
    private final Boolean rebuildWorkspace;
    /**
     * Whether WorkSpaces directory users can restart their workspace.
     * 
     */
    private final Boolean restartWorkspace;
    /**
     * Whether WorkSpaces directory users can switch the running mode of their workspace.
     * 
     */
    private final Boolean switchRunningMode;

    @CustomType.Constructor
    private GetDirectorySelfServicePermission(
        @CustomType.Parameter("changeComputeType") Boolean changeComputeType,
        @CustomType.Parameter("increaseVolumeSize") Boolean increaseVolumeSize,
        @CustomType.Parameter("rebuildWorkspace") Boolean rebuildWorkspace,
        @CustomType.Parameter("restartWorkspace") Boolean restartWorkspace,
        @CustomType.Parameter("switchRunningMode") Boolean switchRunningMode) {
        this.changeComputeType = changeComputeType;
        this.increaseVolumeSize = increaseVolumeSize;
        this.rebuildWorkspace = rebuildWorkspace;
        this.restartWorkspace = restartWorkspace;
        this.switchRunningMode = switchRunningMode;
    }

    /**
     * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace.
     * 
    */
    public Boolean changeComputeType() {
        return this.changeComputeType;
    }
    /**
     * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace.
     * 
    */
    public Boolean increaseVolumeSize() {
        return this.increaseVolumeSize;
    }
    /**
     * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state.
     * 
    */
    public Boolean rebuildWorkspace() {
        return this.rebuildWorkspace;
    }
    /**
     * Whether WorkSpaces directory users can restart their workspace.
     * 
    */
    public Boolean restartWorkspace() {
        return this.restartWorkspace;
    }
    /**
     * Whether WorkSpaces directory users can switch the running mode of their workspace.
     * 
    */
    public Boolean switchRunningMode() {
        return this.switchRunningMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectorySelfServicePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean changeComputeType;
        private Boolean increaseVolumeSize;
        private Boolean rebuildWorkspace;
        private Boolean restartWorkspace;
        private Boolean switchRunningMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectorySelfServicePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeComputeType = defaults.changeComputeType;
    	      this.increaseVolumeSize = defaults.increaseVolumeSize;
    	      this.rebuildWorkspace = defaults.rebuildWorkspace;
    	      this.restartWorkspace = defaults.restartWorkspace;
    	      this.switchRunningMode = defaults.switchRunningMode;
        }

        public Builder changeComputeType(Boolean changeComputeType) {
            this.changeComputeType = Objects.requireNonNull(changeComputeType);
            return this;
        }
        public Builder increaseVolumeSize(Boolean increaseVolumeSize) {
            this.increaseVolumeSize = Objects.requireNonNull(increaseVolumeSize);
            return this;
        }
        public Builder rebuildWorkspace(Boolean rebuildWorkspace) {
            this.rebuildWorkspace = Objects.requireNonNull(rebuildWorkspace);
            return this;
        }
        public Builder restartWorkspace(Boolean restartWorkspace) {
            this.restartWorkspace = Objects.requireNonNull(restartWorkspace);
            return this;
        }
        public Builder switchRunningMode(Boolean switchRunningMode) {
            this.switchRunningMode = Objects.requireNonNull(switchRunningMode);
            return this;
        }        public GetDirectorySelfServicePermission build() {
            return new GetDirectorySelfServicePermission(changeComputeType, increaseVolumeSize, rebuildWorkspace, restartWorkspace, switchRunningMode);
        }
    }
}
