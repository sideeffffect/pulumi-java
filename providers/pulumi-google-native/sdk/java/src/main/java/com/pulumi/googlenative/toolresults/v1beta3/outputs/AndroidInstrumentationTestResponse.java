// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AndroidInstrumentationTestResponse {
    /**
     * @return The java package for the test to be executed. Required
     * 
     */
    private final String testPackageId;
    /**
     * @return The InstrumentationTestRunner class. Required
     * 
     */
    private final String testRunnerClass;
    /**
     * @return Each target must be fully qualified with the package name or class name, in one of these formats: - &#34;package package_name&#34; - &#34;class package_name.class_name&#34; - &#34;class package_name.class_name#method_name&#34; If empty, all targets in the module will be run.
     * 
     */
    private final List<String> testTargets;
    /**
     * @return The flag indicates whether Android Test Orchestrator will be used to run test or not.
     * 
     */
    private final Boolean useOrchestrator;

    @CustomType.Constructor
    private AndroidInstrumentationTestResponse(
        @CustomType.Parameter("testPackageId") String testPackageId,
        @CustomType.Parameter("testRunnerClass") String testRunnerClass,
        @CustomType.Parameter("testTargets") List<String> testTargets,
        @CustomType.Parameter("useOrchestrator") Boolean useOrchestrator) {
        this.testPackageId = testPackageId;
        this.testRunnerClass = testRunnerClass;
        this.testTargets = testTargets;
        this.useOrchestrator = useOrchestrator;
    }

    /**
     * @return The java package for the test to be executed. Required
     * 
     */
    public String testPackageId() {
        return this.testPackageId;
    }
    /**
     * @return The InstrumentationTestRunner class. Required
     * 
     */
    public String testRunnerClass() {
        return this.testRunnerClass;
    }
    /**
     * @return Each target must be fully qualified with the package name or class name, in one of these formats: - &#34;package package_name&#34; - &#34;class package_name.class_name&#34; - &#34;class package_name.class_name#method_name&#34; If empty, all targets in the module will be run.
     * 
     */
    public List<String> testTargets() {
        return this.testTargets;
    }
    /**
     * @return The flag indicates whether Android Test Orchestrator will be used to run test or not.
     * 
     */
    public Boolean useOrchestrator() {
        return this.useOrchestrator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidInstrumentationTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String testPackageId;
        private String testRunnerClass;
        private List<String> testTargets;
        private Boolean useOrchestrator;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidInstrumentationTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testPackageId = defaults.testPackageId;
    	      this.testRunnerClass = defaults.testRunnerClass;
    	      this.testTargets = defaults.testTargets;
    	      this.useOrchestrator = defaults.useOrchestrator;
        }

        public Builder testPackageId(String testPackageId) {
            this.testPackageId = Objects.requireNonNull(testPackageId);
            return this;
        }
        public Builder testRunnerClass(String testRunnerClass) {
            this.testRunnerClass = Objects.requireNonNull(testRunnerClass);
            return this;
        }
        public Builder testTargets(List<String> testTargets) {
            this.testTargets = Objects.requireNonNull(testTargets);
            return this;
        }
        public Builder testTargets(String... testTargets) {
            return testTargets(List.of(testTargets));
        }
        public Builder useOrchestrator(Boolean useOrchestrator) {
            this.useOrchestrator = Objects.requireNonNull(useOrchestrator);
            return this;
        }        public AndroidInstrumentationTestResponse build() {
            return new AndroidInstrumentationTestResponse(testPackageId, testRunnerClass, testTargets, useOrchestrator);
        }
    }
}
