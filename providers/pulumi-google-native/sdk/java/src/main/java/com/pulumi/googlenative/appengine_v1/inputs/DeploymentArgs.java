// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1.inputs.CloudBuildOptionsArgs;
import com.pulumi.googlenative.appengine_v1.inputs.ContainerInfoArgs;
import com.pulumi.googlenative.appengine_v1.inputs.ZipInfoArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Code and application artifacts used to deploy a version to App Engine.
 * 
 */
public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine flexible environment using files or zip.
     * 
     */
    @Import(name="cloudBuildOptions")
    private @Nullable Output<CloudBuildOptionsArgs> cloudBuildOptions;

    public Optional<Output<CloudBuildOptionsArgs>> cloudBuildOptions() {
        return Optional.ofNullable(this.cloudBuildOptions);
    }

    /**
     * The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment.
     * 
     */
    @Import(name="container")
    private @Nullable Output<ContainerInfoArgs> container;

    public Optional<Output<ContainerInfoArgs>> container() {
        return Optional.ofNullable(this.container);
    }

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call.
     * 
     */
    @Import(name="files")
    private @Nullable Output<Map<String,String>> files;

    public Optional<Output<Map<String,String>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * The zip file for this deployment, if this is a zip deployment.
     * 
     */
    @Import(name="zip")
    private @Nullable Output<ZipInfoArgs> zip;

    public Optional<Output<ZipInfoArgs>> zip() {
        return Optional.ofNullable(this.zip);
    }

    private DeploymentArgs() {}

    private DeploymentArgs(DeploymentArgs $) {
        this.cloudBuildOptions = $.cloudBuildOptions;
        this.container = $.container;
        this.files = $.files;
        this.zip = $.zip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentArgs $;

        public Builder() {
            $ = new DeploymentArgs();
        }

        public Builder(DeploymentArgs defaults) {
            $ = new DeploymentArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudBuildOptions(@Nullable Output<CloudBuildOptionsArgs> cloudBuildOptions) {
            $.cloudBuildOptions = cloudBuildOptions;
            return this;
        }

        public Builder cloudBuildOptions(CloudBuildOptionsArgs cloudBuildOptions) {
            return cloudBuildOptions(Output.of(cloudBuildOptions));
        }

        public Builder container(@Nullable Output<ContainerInfoArgs> container) {
            $.container = container;
            return this;
        }

        public Builder container(ContainerInfoArgs container) {
            return container(Output.of(container));
        }

        public Builder files(@Nullable Output<Map<String,String>> files) {
            $.files = files;
            return this;
        }

        public Builder files(Map<String,String> files) {
            return files(Output.of(files));
        }

        public Builder zip(@Nullable Output<ZipInfoArgs> zip) {
            $.zip = zip;
            return this;
        }

        public Builder zip(ZipInfoArgs zip) {
            return zip(Output.of(zip));
        }

        public DeploymentArgs build() {
            return $;
        }
    }

}
