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
      private final String appInitialActivity;

    public String appInitialActivity() {
        return this.appInitialActivity;
    }

    /**
     * The java package for the bootstrap. Optional
     * 
     */
    @Import(name="bootstrapPackageId", required=true)
      private final String bootstrapPackageId;

    public String bootstrapPackageId() {
        return this.bootstrapPackageId;
    }

    /**
     * The runner class for the bootstrap. Optional
     * 
     */
    @Import(name="bootstrapRunnerClass", required=true)
      private final String bootstrapRunnerClass;

    public String bootstrapRunnerClass() {
        return this.bootstrapRunnerClass;
    }

    /**
     * The max depth of the traversal stack Robo can explore. Optional
     * 
     */
    @Import(name="maxDepth", required=true)
      private final Integer maxDepth;

    public Integer maxDepth() {
        return this.maxDepth;
    }

    /**
     * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
     * 
     */
    @Import(name="maxSteps", required=true)
      private final Integer maxSteps;

    public Integer maxSteps() {
        return this.maxSteps;
    }

    public AndroidRoboTestResponse(
        String appInitialActivity,
        String bootstrapPackageId,
        String bootstrapRunnerClass,
        Integer maxDepth,
        Integer maxSteps) {
        this.appInitialActivity = Objects.requireNonNull(appInitialActivity, "expected parameter 'appInitialActivity' to be non-null");
        this.bootstrapPackageId = Objects.requireNonNull(bootstrapPackageId, "expected parameter 'bootstrapPackageId' to be non-null");
        this.bootstrapRunnerClass = Objects.requireNonNull(bootstrapRunnerClass, "expected parameter 'bootstrapRunnerClass' to be non-null");
        this.maxDepth = Objects.requireNonNull(maxDepth, "expected parameter 'maxDepth' to be non-null");
        this.maxSteps = Objects.requireNonNull(maxSteps, "expected parameter 'maxSteps' to be non-null");
    }

    private AndroidRoboTestResponse() {
        this.appInitialActivity = null;
        this.bootstrapPackageId = null;
        this.bootstrapRunnerClass = null;
        this.maxDepth = null;
        this.maxSteps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidRoboTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appInitialActivity;
        private String bootstrapPackageId;
        private String bootstrapRunnerClass;
        private Integer maxDepth;
        private Integer maxSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidRoboTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInitialActivity = defaults.appInitialActivity;
    	      this.bootstrapPackageId = defaults.bootstrapPackageId;
    	      this.bootstrapRunnerClass = defaults.bootstrapRunnerClass;
    	      this.maxDepth = defaults.maxDepth;
    	      this.maxSteps = defaults.maxSteps;
        }

        public Builder appInitialActivity(String appInitialActivity) {
            this.appInitialActivity = Objects.requireNonNull(appInitialActivity);
            return this;
        }
        public Builder bootstrapPackageId(String bootstrapPackageId) {
            this.bootstrapPackageId = Objects.requireNonNull(bootstrapPackageId);
            return this;
        }
        public Builder bootstrapRunnerClass(String bootstrapRunnerClass) {
            this.bootstrapRunnerClass = Objects.requireNonNull(bootstrapRunnerClass);
            return this;
        }
        public Builder maxDepth(Integer maxDepth) {
            this.maxDepth = Objects.requireNonNull(maxDepth);
            return this;
        }
        public Builder maxSteps(Integer maxSteps) {
            this.maxSteps = Objects.requireNonNull(maxSteps);
            return this;
        }        public AndroidRoboTestResponse build() {
            return new AndroidRoboTestResponse(appInitialActivity, bootstrapPackageId, bootstrapRunnerClass, maxDepth, maxSteps);
        }
    }
}
