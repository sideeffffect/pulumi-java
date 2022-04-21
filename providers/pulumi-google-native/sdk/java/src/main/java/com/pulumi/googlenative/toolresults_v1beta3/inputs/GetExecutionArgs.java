// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExecutionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExecutionArgs Empty = new GetExecutionArgs();

    @Import(name="executionId", required=true)
    private String executionId;

    public String executionId() {
        return this.executionId;
    }

    @Import(name="historyId", required=true)
    private String historyId;

    public String historyId() {
        return this.historyId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetExecutionArgs() {}

    private GetExecutionArgs(GetExecutionArgs $) {
        this.executionId = $.executionId;
        this.historyId = $.historyId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExecutionArgs $;

        public Builder() {
            $ = new GetExecutionArgs();
        }

        public Builder(GetExecutionArgs defaults) {
            $ = new GetExecutionArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionId(String executionId) {
            $.executionId = executionId;
            return this;
        }

        public Builder historyId(String historyId) {
            $.historyId = historyId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetExecutionArgs build() {
            $.executionId = Objects.requireNonNull($.executionId, "expected parameter 'executionId' to be non-null");
            $.historyId = Objects.requireNonNull($.historyId, "expected parameter 'historyId' to be non-null");
            return $;
        }
    }

}
