// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iap.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDestGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDestGroupPlainArgs Empty = new GetDestGroupPlainArgs();

    @Import(name="destGroupId", required=true)
    private String destGroupId;

    public String destGroupId() {
        return this.destGroupId;
    }

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

    private GetDestGroupPlainArgs() {}

    private GetDestGroupPlainArgs(GetDestGroupPlainArgs $) {
        this.destGroupId = $.destGroupId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDestGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDestGroupPlainArgs $;

        public Builder() {
            $ = new GetDestGroupPlainArgs();
        }

        public Builder(GetDestGroupPlainArgs defaults) {
            $ = new GetDestGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder destGroupId(String destGroupId) {
            $.destGroupId = destGroupId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDestGroupPlainArgs build() {
            $.destGroupId = Objects.requireNonNull($.destGroupId, "expected parameter 'destGroupId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
