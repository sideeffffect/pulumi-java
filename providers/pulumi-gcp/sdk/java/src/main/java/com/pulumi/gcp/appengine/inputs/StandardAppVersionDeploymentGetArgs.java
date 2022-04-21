// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentFileGetArgs;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentZipGetArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionDeploymentGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionDeploymentGetArgs Empty = new StandardAppVersionDeploymentGetArgs();

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    @Import(name="files")
    private @Nullable Output<List<StandardAppVersionDeploymentFileGetArgs>> files;

    public Optional<Output<List<StandardAppVersionDeploymentFileGetArgs>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    @Import(name="zip")
    private @Nullable Output<StandardAppVersionDeploymentZipGetArgs> zip;

    public Optional<Output<StandardAppVersionDeploymentZipGetArgs>> zip() {
        return Optional.ofNullable(this.zip);
    }

    private StandardAppVersionDeploymentGetArgs() {}

    private StandardAppVersionDeploymentGetArgs(StandardAppVersionDeploymentGetArgs $) {
        this.files = $.files;
        this.zip = $.zip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardAppVersionDeploymentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionDeploymentGetArgs $;

        public Builder() {
            $ = new StandardAppVersionDeploymentGetArgs();
        }

        public Builder(StandardAppVersionDeploymentGetArgs defaults) {
            $ = new StandardAppVersionDeploymentGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder files(@Nullable Output<List<StandardAppVersionDeploymentFileGetArgs>> files) {
            $.files = files;
            return this;
        }

        public Builder files(List<StandardAppVersionDeploymentFileGetArgs> files) {
            return files(Output.of(files));
        }

        public Builder files(StandardAppVersionDeploymentFileGetArgs... files) {
            return files(List.of(files));
        }

        public Builder zip(@Nullable Output<StandardAppVersionDeploymentZipGetArgs> zip) {
            $.zip = zip;
            return this;
        }

        public Builder zip(StandardAppVersionDeploymentZipGetArgs zip) {
            return zip(Output.of(zip));
        }

        public StandardAppVersionDeploymentGetArgs build() {
            return $;
        }
    }

}
