// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentFileGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentZipGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionDeploymentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionDeploymentGetArgs Empty = new StandardAppVersionDeploymentGetArgs();

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    @InputImport(name="files")
      private final @Nullable Input<List<StandardAppVersionDeploymentFileGetArgs>> files;

    public Input<List<StandardAppVersionDeploymentFileGetArgs>> getFiles() {
        return this.files == null ? Input.empty() : this.files;
    }

    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    @InputImport(name="zip")
      private final @Nullable Input<StandardAppVersionDeploymentZipGetArgs> zip;

    public Input<StandardAppVersionDeploymentZipGetArgs> getZip() {
        return this.zip == null ? Input.empty() : this.zip;
    }

    public StandardAppVersionDeploymentGetArgs(
        @Nullable Input<List<StandardAppVersionDeploymentFileGetArgs>> files,
        @Nullable Input<StandardAppVersionDeploymentZipGetArgs> zip) {
        this.files = files;
        this.zip = zip;
    }

    private StandardAppVersionDeploymentGetArgs() {
        this.files = Input.empty();
        this.zip = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionDeploymentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<StandardAppVersionDeploymentFileGetArgs>> files;
        private @Nullable Input<StandardAppVersionDeploymentZipGetArgs> zip;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionDeploymentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder files(@Nullable Input<List<StandardAppVersionDeploymentFileGetArgs>> files) {
            this.files = files;
            return this;
        }

        public Builder files(@Nullable List<StandardAppVersionDeploymentFileGetArgs> files) {
            this.files = Input.ofNullable(files);
            return this;
        }

        public Builder zip(@Nullable Input<StandardAppVersionDeploymentZipGetArgs> zip) {
            this.zip = zip;
            return this;
        }

        public Builder zip(@Nullable StandardAppVersionDeploymentZipGetArgs zip) {
            this.zip = Input.ofNullable(zip);
            return this;
        }
        public StandardAppVersionDeploymentGetArgs build() {
            return new StandardAppVersionDeploymentGetArgs(files, zip);
        }
    }
}
