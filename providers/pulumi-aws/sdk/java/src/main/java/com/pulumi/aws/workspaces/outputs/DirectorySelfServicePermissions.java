// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DirectorySelfServicePermissions {
    /**
     * @return Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
     * 
     */
    private final @Nullable Boolean changeComputeType;
    /**
     * @return Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
     * 
     */
    private final @Nullable Boolean increaseVolumeSize;
    /**
     * @return Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
     * 
     */
    private final @Nullable Boolean rebuildWorkspace;
    /**
     * @return Whether WorkSpaces directory users can restart their workspace. Default `true`.
     * 
     */
    private final @Nullable Boolean restartWorkspace;
    /**
     * @return Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
     * 
     */
    private final @Nullable Boolean switchRunningMode;

    @CustomType.Constructor
    private DirectorySelfServicePermissions(
        @CustomType.Parameter("changeComputeType") @Nullable Boolean changeComputeType,
        @CustomType.Parameter("increaseVolumeSize") @Nullable Boolean increaseVolumeSize,
        @CustomType.Parameter("rebuildWorkspace") @Nullable Boolean rebuildWorkspace,
        @CustomType.Parameter("restartWorkspace") @Nullable Boolean restartWorkspace,
        @CustomType.Parameter("switchRunningMode") @Nullable Boolean switchRunningMode) {
        this.changeComputeType = changeComputeType;
        this.increaseVolumeSize = increaseVolumeSize;
        this.rebuildWorkspace = rebuildWorkspace;
        this.restartWorkspace = restartWorkspace;
        this.switchRunningMode = switchRunningMode;
    }

    /**
     * @return Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
     * 
     */
    public Optional<Boolean> changeComputeType() {
        return Optional.ofNullable(this.changeComputeType);
    }
    /**
     * @return Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
     * 
     */
    public Optional<Boolean> increaseVolumeSize() {
        return Optional.ofNullable(this.increaseVolumeSize);
    }
    /**
     * @return Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
     * 
     */
    public Optional<Boolean> rebuildWorkspace() {
        return Optional.ofNullable(this.rebuildWorkspace);
    }
    /**
     * @return Whether WorkSpaces directory users can restart their workspace. Default `true`.
     * 
     */
    public Optional<Boolean> restartWorkspace() {
        return Optional.ofNullable(this.restartWorkspace);
    }
    /**
     * @return Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
     * 
     */
    public Optional<Boolean> switchRunningMode() {
        return Optional.ofNullable(this.switchRunningMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectorySelfServicePermissions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean changeComputeType;
        private @Nullable Boolean increaseVolumeSize;
        private @Nullable Boolean rebuildWorkspace;
        private @Nullable Boolean restartWorkspace;
        private @Nullable Boolean switchRunningMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectorySelfServicePermissions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeComputeType = defaults.changeComputeType;
    	      this.increaseVolumeSize = defaults.increaseVolumeSize;
    	      this.rebuildWorkspace = defaults.rebuildWorkspace;
    	      this.restartWorkspace = defaults.restartWorkspace;
    	      this.switchRunningMode = defaults.switchRunningMode;
        }

        public Builder changeComputeType(@Nullable Boolean changeComputeType) {
            this.changeComputeType = changeComputeType;
            return this;
        }
        public Builder increaseVolumeSize(@Nullable Boolean increaseVolumeSize) {
            this.increaseVolumeSize = increaseVolumeSize;
            return this;
        }
        public Builder rebuildWorkspace(@Nullable Boolean rebuildWorkspace) {
            this.rebuildWorkspace = rebuildWorkspace;
            return this;
        }
        public Builder restartWorkspace(@Nullable Boolean restartWorkspace) {
            this.restartWorkspace = restartWorkspace;
            return this;
        }
        public Builder switchRunningMode(@Nullable Boolean switchRunningMode) {
            this.switchRunningMode = switchRunningMode;
            return this;
        }        public DirectorySelfServicePermissions build() {
            return new DirectorySelfServicePermissions(changeComputeType, increaseVolumeSize, rebuildWorkspace, restartWorkspace, switchRunningMode);
        }
    }
}
