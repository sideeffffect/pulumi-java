// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HmacKeyArgs extends ResourceArgs {

    public static final HmacKeyArgs Empty = new HmacKeyArgs();

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The email address of the key&#39;s associated service account.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private Output<String> serviceAccountEmail;

    /**
     * @return The email address of the key&#39;s associated service account.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    /**
     * The state of the key. Can be set to one of ACTIVE, INACTIVE.
     * Default value is `ACTIVE`.
     * Possible values are `ACTIVE` and `INACTIVE`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the key. Can be set to one of ACTIVE, INACTIVE.
     * Default value is `ACTIVE`.
     * Possible values are `ACTIVE` and `INACTIVE`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private HmacKeyArgs() {}

    private HmacKeyArgs(HmacKeyArgs $) {
        this.project = $.project;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HmacKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HmacKeyArgs $;

        public Builder() {
            $ = new HmacKeyArgs();
        }

        public Builder(HmacKeyArgs defaults) {
            $ = new HmacKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceAccountEmail The email address of the key&#39;s associated service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail The email address of the key&#39;s associated service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param state The state of the key. Can be set to one of ACTIVE, INACTIVE.
         * Default value is `ACTIVE`.
         * Possible values are `ACTIVE` and `INACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the key. Can be set to one of ACTIVE, INACTIVE.
         * Default value is `ACTIVE`.
         * Possible values are `ACTIVE` and `INACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public HmacKeyArgs build() {
            $.serviceAccountEmail = Objects.requireNonNull($.serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
            return $;
        }
    }

}
