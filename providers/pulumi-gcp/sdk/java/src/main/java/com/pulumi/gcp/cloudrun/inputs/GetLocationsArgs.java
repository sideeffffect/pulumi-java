// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationsArgs Empty = new GetLocationsArgs();

    /**
     * The project to list versions for. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetLocationsArgs() {}

    private GetLocationsArgs(GetLocationsArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationsArgs $;

        public Builder() {
            $ = new GetLocationsArgs();
        }

        public Builder(GetLocationsArgs defaults) {
            $ = new GetLocationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetLocationsArgs build() {
            return $;
        }
    }

}
