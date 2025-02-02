// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * A file or directory to install on the device before the test starts.
 * 
 */
public final class RegularFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegularFileArgs Empty = new RegularFileArgs();

    /**
     * The source file.
     * 
     */
    @Import(name="content", required=true)
    private Output<FileReferenceArgs> content;

    /**
     * @return The source file.
     * 
     */
    public Output<FileReferenceArgs> content() {
        return this.content;
    }

    /**
     * Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE}, /sdcard, or /storage ${ANDROID_DATA}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
     * 
     */
    @Import(name="devicePath", required=true)
    private Output<String> devicePath;

    /**
     * @return Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE}, /sdcard, or /storage ${ANDROID_DATA}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
     * 
     */
    public Output<String> devicePath() {
        return this.devicePath;
    }

    private RegularFileArgs() {}

    private RegularFileArgs(RegularFileArgs $) {
        this.content = $.content;
        this.devicePath = $.devicePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegularFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegularFileArgs $;

        public Builder() {
            $ = new RegularFileArgs();
        }

        public Builder(RegularFileArgs defaults) {
            $ = new RegularFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The source file.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<FileReferenceArgs> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The source file.
         * 
         * @return builder
         * 
         */
        public Builder content(FileReferenceArgs content) {
            return content(Output.of(content));
        }

        /**
         * @param devicePath Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE}, /sdcard, or /storage ${ANDROID_DATA}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
         * 
         * @return builder
         * 
         */
        public Builder devicePath(Output<String> devicePath) {
            $.devicePath = devicePath;
            return this;
        }

        /**
         * @param devicePath Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE}, /sdcard, or /storage ${ANDROID_DATA}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
         * 
         * @return builder
         * 
         */
        public Builder devicePath(String devicePath) {
            return devicePath(Output.of(devicePath));
        }

        public RegularFileArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.devicePath = Objects.requireNonNull($.devicePath, "expected parameter 'devicePath' to be non-null");
            return $;
        }
    }

}
