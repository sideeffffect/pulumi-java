// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecuritySettingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecuritySettingArgs Empty = new GetSecuritySettingArgs();

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

    @Import(name="securitySettingId", required=true)
    private String securitySettingId;

    public String securitySettingId() {
        return this.securitySettingId;
    }

    private GetSecuritySettingArgs() {}

    private GetSecuritySettingArgs(GetSecuritySettingArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.securitySettingId = $.securitySettingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecuritySettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecuritySettingArgs $;

        public Builder() {
            $ = new GetSecuritySettingArgs();
        }

        public Builder(GetSecuritySettingArgs defaults) {
            $ = new GetSecuritySettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder securitySettingId(String securitySettingId) {
            $.securitySettingId = securitySettingId;
            return this;
        }

        public GetSecuritySettingArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.securitySettingId = Objects.requireNonNull($.securitySettingId, "expected parameter 'securitySettingId' to be non-null");
            return $;
        }
    }

}
