// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectServiceAccountArgs extends InvokeArgs {

    public static final GetProjectServiceAccountArgs Empty = new GetProjectServiceAccountArgs();

    /**
     * The project the unique service account was created for. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project the unique service account was created for. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The project the lookup originates from. This field is used if you are making the request
     * from a different account than the one you are finding the service account for.
     * 
     */
    @Import(name="userProject")
    private @Nullable String userProject;

    /**
     * @return The project the lookup originates from. This field is used if you are making the request
     * from a different account than the one you are finding the service account for.
     * 
     */
    public Optional<String> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetProjectServiceAccountArgs() {}

    private GetProjectServiceAccountArgs(GetProjectServiceAccountArgs $) {
        this.project = $.project;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectServiceAccountArgs $;

        public Builder() {
            $ = new GetProjectServiceAccountArgs();
        }

        public Builder(GetProjectServiceAccountArgs defaults) {
            $ = new GetProjectServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project the unique service account was created for. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param userProject The project the lookup originates from. This field is used if you are making the request
         * from a different account than the one you are finding the service account for.
         * 
         * @return builder
         * 
         */
        public Builder userProject(@Nullable String userProject) {
            $.userProject = userProject;
            return this;
        }

        public GetProjectServiceAccountArgs build() {
            return $;
        }
    }

}
