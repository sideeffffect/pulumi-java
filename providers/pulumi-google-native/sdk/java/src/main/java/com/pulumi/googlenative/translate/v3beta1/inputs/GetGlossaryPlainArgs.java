// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate.v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlossaryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlossaryPlainArgs Empty = new GetGlossaryPlainArgs();

    @Import(name="glossaryId", required=true)
    private String glossaryId;

    public String glossaryId() {
        return this.glossaryId;
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

    private GetGlossaryPlainArgs() {}

    private GetGlossaryPlainArgs(GetGlossaryPlainArgs $) {
        this.glossaryId = $.glossaryId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlossaryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlossaryPlainArgs $;

        public Builder() {
            $ = new GetGlossaryPlainArgs();
        }

        public Builder(GetGlossaryPlainArgs defaults) {
            $ = new GetGlossaryPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder glossaryId(String glossaryId) {
            $.glossaryId = glossaryId;
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

        public GetGlossaryPlainArgs build() {
            $.glossaryId = Objects.requireNonNull($.glossaryId, "expected parameter 'glossaryId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
