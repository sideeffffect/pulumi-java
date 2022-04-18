// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The configuration for continuous tests.
 * 
 */
public final class GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse Empty = new GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse();

    /**
     * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
     * 
     */
    @Import(name="enableContinuousRun", required=true)
      private final Boolean enableContinuousRun;

    public Boolean enableContinuousRun() {
        return this.enableContinuousRun;
    }

    /**
     * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
     * 
     */
    @Import(name="enablePredeploymentRun", required=true)
      private final Boolean enablePredeploymentRun;

    public Boolean enablePredeploymentRun() {
        return this.enablePredeploymentRun;
    }

    /**
     * A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
     * 
     */
    @Import(name="testCases", required=true)
      private final List<String> testCases;

    public List<String> testCases() {
        return this.testCases;
    }

    public GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse(
        Boolean enableContinuousRun,
        Boolean enablePredeploymentRun,
        List<String> testCases) {
        this.enableContinuousRun = Objects.requireNonNull(enableContinuousRun, "expected parameter 'enableContinuousRun' to be non-null");
        this.enablePredeploymentRun = Objects.requireNonNull(enablePredeploymentRun, "expected parameter 'enablePredeploymentRun' to be non-null");
        this.testCases = Objects.requireNonNull(testCases, "expected parameter 'testCases' to be non-null");
    }

    private GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse() {
        this.enableContinuousRun = null;
        this.enablePredeploymentRun = null;
        this.testCases = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableContinuousRun;
        private Boolean enablePredeploymentRun;
        private List<String> testCases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableContinuousRun = defaults.enableContinuousRun;
    	      this.enablePredeploymentRun = defaults.enablePredeploymentRun;
    	      this.testCases = defaults.testCases;
        }

        public Builder enableContinuousRun(Boolean enableContinuousRun) {
            this.enableContinuousRun = Objects.requireNonNull(enableContinuousRun);
            return this;
        }
        public Builder enablePredeploymentRun(Boolean enablePredeploymentRun) {
            this.enablePredeploymentRun = Objects.requireNonNull(enablePredeploymentRun);
            return this;
        }
        public Builder testCases(List<String> testCases) {
            this.testCases = Objects.requireNonNull(testCases);
            return this;
        }
        public Builder testCases(String... testCases) {
            return testCases(List.of(testCases));
        }        public GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse build() {
            return new GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigResponse(enableContinuousRun, enablePredeploymentRun, testCases);
        }
    }
}
