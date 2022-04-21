// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryRepositoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryRepositoryArgs Empty = new GetRegistryRepositoryArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetRegistryRepositoryArgs() {}

    private GetRegistryRepositoryArgs(GetRegistryRepositoryArgs $) {
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryRepositoryArgs $;

        public Builder() {
            $ = new GetRegistryRepositoryArgs();
        }

        public Builder(GetRegistryRepositoryArgs defaults) {
            $ = new GetRegistryRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetRegistryRepositoryArgs build() {
            return $;
        }
    }

}
