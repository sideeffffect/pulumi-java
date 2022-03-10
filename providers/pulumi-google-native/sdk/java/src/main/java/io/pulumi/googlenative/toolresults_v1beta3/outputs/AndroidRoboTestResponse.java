// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AndroidRoboTestResponse {
    /**
     * The initial activity that should be used to start the app. Optional
     * 
     */
    private final String appInitialActivity;
    /**
     * The java package for the bootstrap. Optional
     * 
     */
    private final String bootstrapPackageId;
    /**
     * The runner class for the bootstrap. Optional
     * 
     */
    private final String bootstrapRunnerClass;
    /**
     * The max depth of the traversal stack Robo can explore. Optional
     * 
     */
    private final Integer maxDepth;
    /**
     * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
     * 
     */
    private final Integer maxSteps;

    @OutputCustomType.Constructor
    private AndroidRoboTestResponse(
        @OutputCustomType.Parameter("appInitialActivity") String appInitialActivity,
        @OutputCustomType.Parameter("bootstrapPackageId") String bootstrapPackageId,
        @OutputCustomType.Parameter("bootstrapRunnerClass") String bootstrapRunnerClass,
        @OutputCustomType.Parameter("maxDepth") Integer maxDepth,
        @OutputCustomType.Parameter("maxSteps") Integer maxSteps) {
        this.appInitialActivity = appInitialActivity;
        this.bootstrapPackageId = bootstrapPackageId;
        this.bootstrapRunnerClass = bootstrapRunnerClass;
        this.maxDepth = maxDepth;
        this.maxSteps = maxSteps;
    }

    /**
     * The initial activity that should be used to start the app. Optional
     * 
    */
    public String getAppInitialActivity() {
        return this.appInitialActivity;
    }
    /**
     * The java package for the bootstrap. Optional
     * 
    */
    public String getBootstrapPackageId() {
        return this.bootstrapPackageId;
    }
    /**
     * The runner class for the bootstrap. Optional
     * 
    */
    public String getBootstrapRunnerClass() {
        return this.bootstrapRunnerClass;
    }
    /**
     * The max depth of the traversal stack Robo can explore. Optional
     * 
    */
    public Integer getMaxDepth() {
        return this.maxDepth;
    }
    /**
     * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
     * 
    */
    public Integer getMaxSteps() {
        return this.maxSteps;
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
        }
        public AndroidRoboTestResponse build() {
            return new AndroidRoboTestResponse(appInitialActivity, bootstrapPackageId, bootstrapRunnerClass, maxDepth, maxSteps);
        }
    }
}
