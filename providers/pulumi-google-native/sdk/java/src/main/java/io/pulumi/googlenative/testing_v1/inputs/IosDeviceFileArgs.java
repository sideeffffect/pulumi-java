// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A file or directory to install on the device before the test starts.
 * 
 */
public final class IosDeviceFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final IosDeviceFileArgs Empty = new IosDeviceFileArgs();

    /**
     * The bundle id of the app where this file lives. iOS apps sandbox their own filesystem, so app files must specify which app installed on the device.
     * 
     */
    @InputImport(name="bundleId")
      private final @Nullable Input<String> bundleId;

    public Input<String> getBundleId() {
        return this.bundleId == null ? Input.empty() : this.bundleId;
    }

    /**
     * The source file
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<FileReferenceArgs> content;

    public Input<FileReferenceArgs> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * Location of the file on the device, inside the app's sandboxed filesystem
     * 
     */
    @InputImport(name="devicePath")
      private final @Nullable Input<String> devicePath;

    public Input<String> getDevicePath() {
        return this.devicePath == null ? Input.empty() : this.devicePath;
    }

    public IosDeviceFileArgs(
        @Nullable Input<String> bundleId,
        @Nullable Input<FileReferenceArgs> content,
        @Nullable Input<String> devicePath) {
        this.bundleId = bundleId;
        this.content = content;
        this.devicePath = devicePath;
    }

    private IosDeviceFileArgs() {
        this.bundleId = Input.empty();
        this.content = Input.empty();
        this.devicePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosDeviceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bundleId;
        private @Nullable Input<FileReferenceArgs> content;
        private @Nullable Input<String> devicePath;

        public Builder() {
    	      // Empty
        }

        public Builder(IosDeviceFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.content = defaults.content;
    	      this.devicePath = defaults.devicePath;
        }

        public Builder bundleId(@Nullable Input<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = Input.ofNullable(bundleId);
            return this;
        }

        public Builder content(@Nullable Input<FileReferenceArgs> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable FileReferenceArgs content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder devicePath(@Nullable Input<String> devicePath) {
            this.devicePath = devicePath;
            return this;
        }

        public Builder devicePath(@Nullable String devicePath) {
            this.devicePath = Input.ofNullable(devicePath);
            return this;
        }
        public IosDeviceFileArgs build() {
            return new IosDeviceFileArgs(bundleId, content, devicePath);
        }
    }
}
