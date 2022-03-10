// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StudioComponentSharedFileSystemConfiguration {
    /**
     * <p>The endpoint of the shared file system that is accessed by the studio component resource.</p>
     * 
     */
    private final @Nullable String endpoint;
    /**
     * <p>The unique identifier for a file system.</p>
     * 
     */
    private final @Nullable String fileSystemId;
    /**
     * <p>The mount location for a shared file system on a Linux virtual workstation.</p>
     * 
     */
    private final @Nullable String linuxMountPoint;
    /**
     * <p>The name of the file share.</p>
     * 
     */
    private final @Nullable String shareName;
    /**
     * <p>The mount location for a shared file system on a Windows virtual workstation.</p>
     * 
     */
    private final @Nullable String windowsMountDrive;

    @OutputCustomType.Constructor
    private StudioComponentSharedFileSystemConfiguration(
        @OutputCustomType.Parameter("endpoint") @Nullable String endpoint,
        @OutputCustomType.Parameter("fileSystemId") @Nullable String fileSystemId,
        @OutputCustomType.Parameter("linuxMountPoint") @Nullable String linuxMountPoint,
        @OutputCustomType.Parameter("shareName") @Nullable String shareName,
        @OutputCustomType.Parameter("windowsMountDrive") @Nullable String windowsMountDrive) {
        this.endpoint = endpoint;
        this.fileSystemId = fileSystemId;
        this.linuxMountPoint = linuxMountPoint;
        this.shareName = shareName;
        this.windowsMountDrive = windowsMountDrive;
    }

    /**
     * <p>The endpoint of the shared file system that is accessed by the studio component resource.</p>
     * 
    */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * <p>The unique identifier for a file system.</p>
     * 
    */
    public Optional<String> getFileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }
    /**
     * <p>The mount location for a shared file system on a Linux virtual workstation.</p>
     * 
    */
    public Optional<String> getLinuxMountPoint() {
        return Optional.ofNullable(this.linuxMountPoint);
    }
    /**
     * <p>The name of the file share.</p>
     * 
    */
    public Optional<String> getShareName() {
        return Optional.ofNullable(this.shareName);
    }
    /**
     * <p>The mount location for a shared file system on a Windows virtual workstation.</p>
     * 
    */
    public Optional<String> getWindowsMountDrive() {
        return Optional.ofNullable(this.windowsMountDrive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentSharedFileSystemConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String fileSystemId;
        private @Nullable String linuxMountPoint;
        private @Nullable String shareName;
        private @Nullable String windowsMountDrive;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentSharedFileSystemConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.linuxMountPoint = defaults.linuxMountPoint;
    	      this.shareName = defaults.shareName;
    	      this.windowsMountDrive = defaults.windowsMountDrive;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder fileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder linuxMountPoint(@Nullable String linuxMountPoint) {
            this.linuxMountPoint = linuxMountPoint;
            return this;
        }

        public Builder shareName(@Nullable String shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder windowsMountDrive(@Nullable String windowsMountDrive) {
            this.windowsMountDrive = windowsMountDrive;
            return this;
        }
        public StudioComponentSharedFileSystemConfiguration build() {
            return new StudioComponentSharedFileSystemConfiguration(endpoint, fileSystemId, linuxMountPoint, shareName, windowsMountDrive);
        }
    }
}
