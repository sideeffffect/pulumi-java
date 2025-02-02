// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFleetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFleetPlainArgs Empty = new GetFleetPlainArgs();

    @Import(name="fleetId", required=true)
    private String fleetId;

    public String fleetId() {
        return this.fleetId;
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

    private GetFleetPlainArgs() {}

    private GetFleetPlainArgs(GetFleetPlainArgs $) {
        this.fleetId = $.fleetId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFleetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFleetPlainArgs $;

        public Builder() {
            $ = new GetFleetPlainArgs();
        }

        public Builder(GetFleetPlainArgs defaults) {
            $ = new GetFleetPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder fleetId(String fleetId) {
            $.fleetId = fleetId;
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

        public GetFleetPlainArgs build() {
            $.fleetId = Objects.requireNonNull($.fleetId, "expected parameter 'fleetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
