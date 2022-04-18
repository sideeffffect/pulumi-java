// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class IosTestLoopResponse {
    /**
     * The bundle id for the application under test.
     * 
     */
    private final String appBundleId;
    /**
     * The .ipa of the application to test.
     * 
     */
    private final FileReferenceResponse appIpa;
    /**
     * The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
     * 
     */
    private final List<Integer> scenarios;

    @CustomType.Constructor
    private IosTestLoopResponse(
        @CustomType.Parameter("appBundleId") String appBundleId,
        @CustomType.Parameter("appIpa") FileReferenceResponse appIpa,
        @CustomType.Parameter("scenarios") List<Integer> scenarios) {
        this.appBundleId = appBundleId;
        this.appIpa = appIpa;
        this.scenarios = scenarios;
    }

    /**
     * The bundle id for the application under test.
     * 
    */
    public String appBundleId() {
        return this.appBundleId;
    }
    /**
     * The .ipa of the application to test.
     * 
    */
    public FileReferenceResponse appIpa() {
        return this.appIpa;
    }
    /**
     * The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
     * 
    */
    public List<Integer> scenarios() {
        return this.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestLoopResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appBundleId;
        private FileReferenceResponse appIpa;
        private List<Integer> scenarios;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestLoopResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appBundleId = defaults.appBundleId;
    	      this.appIpa = defaults.appIpa;
    	      this.scenarios = defaults.scenarios;
        }

        public Builder appBundleId(String appBundleId) {
            this.appBundleId = Objects.requireNonNull(appBundleId);
            return this;
        }
        public Builder appIpa(FileReferenceResponse appIpa) {
            this.appIpa = Objects.requireNonNull(appIpa);
            return this;
        }
        public Builder scenarios(List<Integer> scenarios) {
            this.scenarios = Objects.requireNonNull(scenarios);
            return this;
        }
        public Builder scenarios(Integer... scenarios) {
            return scenarios(List.of(scenarios));
        }        public IosTestLoopResponse build() {
            return new IosTestLoopResponse(appBundleId, appIpa, scenarios);
        }
    }
}
