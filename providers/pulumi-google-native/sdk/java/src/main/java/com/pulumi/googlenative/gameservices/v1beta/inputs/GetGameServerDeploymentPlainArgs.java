// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGameServerDeploymentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGameServerDeploymentPlainArgs Empty = new GetGameServerDeploymentPlainArgs();

    @Import(name="gameServerDeploymentId", required=true)
    private String gameServerDeploymentId;

    public String gameServerDeploymentId() {
        return this.gameServerDeploymentId;
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

    private GetGameServerDeploymentPlainArgs() {}

    private GetGameServerDeploymentPlainArgs(GetGameServerDeploymentPlainArgs $) {
        this.gameServerDeploymentId = $.gameServerDeploymentId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGameServerDeploymentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGameServerDeploymentPlainArgs $;

        public Builder() {
            $ = new GetGameServerDeploymentPlainArgs();
        }

        public Builder(GetGameServerDeploymentPlainArgs defaults) {
            $ = new GetGameServerDeploymentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder gameServerDeploymentId(String gameServerDeploymentId) {
            $.gameServerDeploymentId = gameServerDeploymentId;
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

        public GetGameServerDeploymentPlainArgs build() {
            $.gameServerDeploymentId = Objects.requireNonNull($.gameServerDeploymentId, "expected parameter 'gameServerDeploymentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
