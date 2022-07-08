// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionPlainArgs Empty = new GetConnectionPlainArgs();

    @Import(name="connectionId", required=true)
    private String connectionId;

    public String connectionId() {
        return this.connectionId;
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

    private GetConnectionPlainArgs() {}

    private GetConnectionPlainArgs(GetConnectionPlainArgs $) {
        this.connectionId = $.connectionId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionPlainArgs $;

        public Builder() {
            $ = new GetConnectionPlainArgs();
        }

        public Builder(GetConnectionPlainArgs defaults) {
            $ = new GetConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionId(String connectionId) {
            $.connectionId = connectionId;
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

        public GetConnectionPlainArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
