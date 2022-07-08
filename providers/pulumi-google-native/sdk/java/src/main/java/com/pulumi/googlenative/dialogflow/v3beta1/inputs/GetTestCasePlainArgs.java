// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestCasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTestCasePlainArgs Empty = new GetTestCasePlainArgs();

    @Import(name="agentId", required=true)
    private String agentId;

    public String agentId() {
        return this.agentId;
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

    @Import(name="testCaseId", required=true)
    private String testCaseId;

    public String testCaseId() {
        return this.testCaseId;
    }

    private GetTestCasePlainArgs() {}

    private GetTestCasePlainArgs(GetTestCasePlainArgs $) {
        this.agentId = $.agentId;
        this.location = $.location;
        this.project = $.project;
        this.testCaseId = $.testCaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTestCasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTestCasePlainArgs $;

        public Builder() {
            $ = new GetTestCasePlainArgs();
        }

        public Builder(GetTestCasePlainArgs defaults) {
            $ = new GetTestCasePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(String agentId) {
            $.agentId = agentId;
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

        public Builder testCaseId(String testCaseId) {
            $.testCaseId = testCaseId;
            return this;
        }

        public GetTestCasePlainArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.testCaseId = Objects.requireNonNull($.testCaseId, "expected parameter 'testCaseId' to be non-null");
            return $;
        }
    }

}
