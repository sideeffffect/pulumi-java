// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorArgs Empty = new GetConnectorArgs();

    @Import(name="connectorId", required=true)
    private Output<String> connectorId;

    public Output<String> connectorId() {
        return this.connectorId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetConnectorArgs() {}

    private GetConnectorArgs(GetConnectorArgs $) {
        this.connectorId = $.connectorId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorArgs $;

        public Builder() {
            $ = new GetConnectorArgs();
        }

        public Builder(GetConnectorArgs defaults) {
            $ = new GetConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectorId(Output<String> connectorId) {
            $.connectorId = connectorId;
            return this;
        }

        public Builder connectorId(String connectorId) {
            return connectorId(Output.of(connectorId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetConnectorArgs build() {
            $.connectorId = Objects.requireNonNull($.connectorId, "expected parameter 'connectorId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
