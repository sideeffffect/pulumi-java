// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An Android package file to install.
 * 
 */
public final class ApkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApkResponse Empty = new ApkResponse();

    /**
     * The path to an APK to be installed on the device before the test begins.
     * 
     */
    @InputImport(name="location", required=true)
      private final FileReferenceResponse location;

    public FileReferenceResponse getLocation() {
        return this.location;
    }

    /**
     * The java package for the APK to be installed. Value is determined by examining the application's manifest.
     * 
     */
    @InputImport(name="packageName", required=true)
      private final String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public ApkResponse(
        FileReferenceResponse location,
        String packageName) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.packageName = Objects.requireNonNull(packageName, "expected parameter 'packageName' to be non-null");
    }

    private ApkResponse() {
        this.location = null;
        this.packageName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse location;
        private String packageName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.packageName = defaults.packageName;
        }

        public Builder location(FileReferenceResponse location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder packageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }
        public ApkResponse build() {
            return new ApkResponse(location, packageName);
        }
    }
}
