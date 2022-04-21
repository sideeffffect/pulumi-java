// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationArgs Empty = new GetRegistrationArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="registrationId", required=true)
    private String registrationId;

    public String registrationId() {
        return this.registrationId;
    }

    private GetRegistrationArgs() {}

    private GetRegistrationArgs(GetRegistrationArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.registrationId = $.registrationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistrationArgs $;

        public Builder() {
            $ = new GetRegistrationArgs();
        }

        public Builder(GetRegistrationArgs defaults) {
            $ = new GetRegistrationArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder registrationId(String registrationId) {
            $.registrationId = registrationId;
            return this;
        }

        public GetRegistrationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.registrationId = Objects.requireNonNull($.registrationId, "expected parameter 'registrationId' to be non-null");
            return $;
        }
    }

}
