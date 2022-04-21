// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetProjectProject extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectProject Empty = new GetProjectProject();

    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    @Import(name="lifecycleState", required=true)
    private String lifecycleState;

    public String lifecycleState() {
        return this.lifecycleState;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="number", required=true)
    private String number;

    public String number() {
        return this.number;
    }

    @Import(name="parent", required=true)
    private Map<String,String> parent;

    public Map<String,String> parent() {
        return this.parent;
    }

    /**
     * The project id of the project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    public String projectId() {
        return this.projectId;
    }

    private GetProjectProject() {}

    private GetProjectProject(GetProjectProject $) {
        this.createTime = $.createTime;
        this.labels = $.labels;
        this.lifecycleState = $.lifecycleState;
        this.name = $.name;
        this.number = $.number;
        this.parent = $.parent;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectProject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectProject $;

        public Builder() {
            $ = new GetProjectProject();
        }

        public Builder(GetProjectProject defaults) {
            $ = new GetProjectProject(Objects.requireNonNull(defaults));
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public Builder lifecycleState(String lifecycleState) {
            $.lifecycleState = lifecycleState;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder number(String number) {
            $.number = number;
            return this;
        }

        public Builder parent(Map<String,String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetProjectProject build() {
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.lifecycleState = Objects.requireNonNull($.lifecycleState, "expected parameter 'lifecycleState' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.number = Objects.requireNonNull($.number, "expected parameter 'number' to be non-null");
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
