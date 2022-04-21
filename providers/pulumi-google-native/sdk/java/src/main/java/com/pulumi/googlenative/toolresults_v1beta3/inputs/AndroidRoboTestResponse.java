// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A test of an android application that explores the application on a virtual or physical Android device, finding culprits and crashes as it goes.
 * 
 */
public final class AndroidRoboTestResponse extends com.pulumi.resources.InvokeArgs {

    public static final AndroidRoboTestResponse Empty = new AndroidRoboTestResponse();

    /**
     * The initial activity that should be used to start the app. Optional
     * 
     */
    @Import(name="appInitialActivity", required=true)
    private String appInitialActivity;

    public String appInitialActivity() {
        return this.appInitialActivity;
    }

    /**
     * The java package for the bootstrap. Optional
     * 
     */
    @Import(name="bootstrapPackageId", required=true)
    private String bootstrapPackageId;

    public String bootstrapPackageId() {
        return this.bootstrapPackageId;
    }

    /**
     * The runner class for the bootstrap. Optional
     * 
     */
    @Import(name="bootstrapRunnerClass", required=true)
    private String bootstrapRunnerClass;

    public String bootstrapRunnerClass() {
        return this.bootstrapRunnerClass;
    }

    /**
     * The max depth of the traversal stack Robo can explore. Optional
     * 
     */
    @Import(name="maxDepth", required=true)
    private Integer maxDepth;

    public Integer maxDepth() {
        return this.maxDepth;
    }

    /**
     * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
     * 
     */
    @Import(name="maxSteps", required=true)
    private Integer maxSteps;

    public Integer maxSteps() {
        return this.maxSteps;
    }

    private AndroidRoboTestResponse() {}

    private AndroidRoboTestResponse(AndroidRoboTestResponse $) {
        this.appInitialActivity = $.appInitialActivity;
        this.bootstrapPackageId = $.bootstrapPackageId;
        this.bootstrapRunnerClass = $.bootstrapRunnerClass;
        this.maxDepth = $.maxDepth;
        this.maxSteps = $.maxSteps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidRoboTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidRoboTestResponse $;

        public Builder() {
            $ = new AndroidRoboTestResponse();
        }

        public Builder(AndroidRoboTestResponse defaults) {
            $ = new AndroidRoboTestResponse(Objects.requireNonNull(defaults));
        }

        public Builder appInitialActivity(String appInitialActivity) {
            $.appInitialActivity = appInitialActivity;
            return this;
        }

        public Builder bootstrapPackageId(String bootstrapPackageId) {
            $.bootstrapPackageId = bootstrapPackageId;
            return this;
        }

        public Builder bootstrapRunnerClass(String bootstrapRunnerClass) {
            $.bootstrapRunnerClass = bootstrapRunnerClass;
            return this;
        }

        public Builder maxDepth(Integer maxDepth) {
            $.maxDepth = maxDepth;
            return this;
        }

        public Builder maxSteps(Integer maxSteps) {
            $.maxSteps = maxSteps;
            return this;
        }

        public AndroidRoboTestResponse build() {
            $.appInitialActivity = Objects.requireNonNull($.appInitialActivity, "expected parameter 'appInitialActivity' to be non-null");
            $.bootstrapPackageId = Objects.requireNonNull($.bootstrapPackageId, "expected parameter 'bootstrapPackageId' to be non-null");
            $.bootstrapRunnerClass = Objects.requireNonNull($.bootstrapRunnerClass, "expected parameter 'bootstrapRunnerClass' to be non-null");
            $.maxDepth = Objects.requireNonNull($.maxDepth, "expected parameter 'maxDepth' to be non-null");
            $.maxSteps = Objects.requireNonNull($.maxSteps, "expected parameter 'maxSteps' to be non-null");
            return $;
        }
    }

}
