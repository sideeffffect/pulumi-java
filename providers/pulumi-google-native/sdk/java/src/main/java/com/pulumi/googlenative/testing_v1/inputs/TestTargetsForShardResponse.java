// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Test targets for a shard.
 * 
 */
public final class TestTargetsForShardResponse extends com.pulumi.resources.InvokeArgs {

    public static final TestTargetsForShardResponse Empty = new TestTargetsForShardResponse();

    /**
     * Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, "package com.my.packages" "class com.my.package.MyClass". The number of shard_test_targets must be greater than 0.
     * 
     */
    @Import(name="testTargets", required=true)
      private final List<String> testTargets;

    public List<String> testTargets() {
        return this.testTargets;
    }

    public TestTargetsForShardResponse(List<String> testTargets) {
        this.testTargets = Objects.requireNonNull(testTargets, "expected parameter 'testTargets' to be non-null");
    }

    private TestTargetsForShardResponse() {
        this.testTargets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestTargetsForShardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> testTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(TestTargetsForShardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testTargets = defaults.testTargets;
        }

        public Builder testTargets(List<String> testTargets) {
            this.testTargets = Objects.requireNonNull(testTargets);
            return this;
        }
        public Builder testTargets(String... testTargets) {
            return testTargets(List.of(testTargets));
        }        public TestTargetsForShardResponse build() {
            return new TestTargetsForShardResponse(testTargets);
        }
    }
}
