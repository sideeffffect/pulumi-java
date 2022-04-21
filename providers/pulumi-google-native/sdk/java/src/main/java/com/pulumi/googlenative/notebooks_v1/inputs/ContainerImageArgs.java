// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of a container image for starting a notebook instance with the environment installed in a container.
 * 
 */
public final class ContainerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerImageArgs Empty = new ContainerImageArgs();

    /**
     * The path to the container image repository. For example: `gcr.io/{project_id}/{image_name}`
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }

    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private ContainerImageArgs() {}

    private ContainerImageArgs(ContainerImageArgs $) {
        this.repository = $.repository;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerImageArgs $;

        public Builder() {
            $ = new ContainerImageArgs();
        }

        public Builder(ContainerImageArgs defaults) {
            $ = new ContainerImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public ContainerImageArgs build() {
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
