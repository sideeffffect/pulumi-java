// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatacenterConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatacenterConnectorArgs Empty = new GetDatacenterConnectorArgs();

    @Import(name="datacenterConnectorId", required=true)
    private String datacenterConnectorId;

    public String datacenterConnectorId() {
        return this.datacenterConnectorId;
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

    @Import(name="sourceId", required=true)
    private String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    private GetDatacenterConnectorArgs() {}

    private GetDatacenterConnectorArgs(GetDatacenterConnectorArgs $) {
        this.datacenterConnectorId = $.datacenterConnectorId;
        this.location = $.location;
        this.project = $.project;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatacenterConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatacenterConnectorArgs $;

        public Builder() {
            $ = new GetDatacenterConnectorArgs();
        }

        public Builder(GetDatacenterConnectorArgs defaults) {
            $ = new GetDatacenterConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder datacenterConnectorId(String datacenterConnectorId) {
            $.datacenterConnectorId = datacenterConnectorId;
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

        public Builder sourceId(String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public GetDatacenterConnectorArgs build() {
            $.datacenterConnectorId = Objects.requireNonNull($.datacenterConnectorId, "expected parameter 'datacenterConnectorId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
