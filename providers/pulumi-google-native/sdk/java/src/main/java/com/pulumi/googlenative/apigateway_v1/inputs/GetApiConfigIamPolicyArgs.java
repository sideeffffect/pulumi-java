// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiConfigIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiConfigIamPolicyArgs Empty = new GetApiConfigIamPolicyArgs();

    @Import(name="apiId", required=true)
    private String apiId;

    public String apiId() {
        return this.apiId;
    }

    @Import(name="configId", required=true)
    private String configId;

    public String configId() {
        return this.configId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetApiConfigIamPolicyArgs() {}

    private GetApiConfigIamPolicyArgs(GetApiConfigIamPolicyArgs $) {
        this.apiId = $.apiId;
        this.configId = $.configId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiConfigIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiConfigIamPolicyArgs $;

        public Builder() {
            $ = new GetApiConfigIamPolicyArgs();
        }

        public Builder(GetApiConfigIamPolicyArgs defaults) {
            $ = new GetApiConfigIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder configId(String configId) {
            $.configId = configId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetApiConfigIamPolicyArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
