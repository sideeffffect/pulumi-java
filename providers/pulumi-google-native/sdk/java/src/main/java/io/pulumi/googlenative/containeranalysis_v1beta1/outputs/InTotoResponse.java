// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.ArtifactRuleResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.SigningKeyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InTotoResponse {
    /**
     * This field contains the expected command used to perform the step.
     * 
     */
    private final List<String> expectedCommand;
    /**
     * The following fields contain in-toto artifact rules identifying the artifacts that enter this supply chain step, and exit the supply chain step, i.e. materials and products of the step.
     * 
     */
    private final List<ArtifactRuleResponse> expectedMaterials;
    private final List<ArtifactRuleResponse> expectedProducts;
    /**
     * This field contains the public keys that can be used to verify the signatures on the step metadata.
     * 
     */
    private final List<SigningKeyResponse> signingKeys;
    /**
     * This field identifies the name of the step in the supply chain.
     * 
     */
    private final String stepName;
    /**
     * This field contains a value that indicates the minimum number of keys that need to be used to sign the step's in-toto link.
     * 
     */
    private final String threshold;

    @OutputCustomType.Constructor
    private InTotoResponse(
        @OutputCustomType.Parameter("expectedCommand") List<String> expectedCommand,
        @OutputCustomType.Parameter("expectedMaterials") List<ArtifactRuleResponse> expectedMaterials,
        @OutputCustomType.Parameter("expectedProducts") List<ArtifactRuleResponse> expectedProducts,
        @OutputCustomType.Parameter("signingKeys") List<SigningKeyResponse> signingKeys,
        @OutputCustomType.Parameter("stepName") String stepName,
        @OutputCustomType.Parameter("threshold") String threshold) {
        this.expectedCommand = expectedCommand;
        this.expectedMaterials = expectedMaterials;
        this.expectedProducts = expectedProducts;
        this.signingKeys = signingKeys;
        this.stepName = stepName;
        this.threshold = threshold;
    }

    /**
     * This field contains the expected command used to perform the step.
     * 
    */
    public List<String> getExpectedCommand() {
        return this.expectedCommand;
    }
    /**
     * The following fields contain in-toto artifact rules identifying the artifacts that enter this supply chain step, and exit the supply chain step, i.e. materials and products of the step.
     * 
    */
    public List<ArtifactRuleResponse> getExpectedMaterials() {
        return this.expectedMaterials;
    }
    public List<ArtifactRuleResponse> getExpectedProducts() {
        return this.expectedProducts;
    }
    /**
     * This field contains the public keys that can be used to verify the signatures on the step metadata.
     * 
    */
    public List<SigningKeyResponse> getSigningKeys() {
        return this.signingKeys;
    }
    /**
     * This field identifies the name of the step in the supply chain.
     * 
    */
    public String getStepName() {
        return this.stepName;
    }
    /**
     * This field contains a value that indicates the minimum number of keys that need to be used to sign the step's in-toto link.
     * 
    */
    public String getThreshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InTotoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> expectedCommand;
        private List<ArtifactRuleResponse> expectedMaterials;
        private List<ArtifactRuleResponse> expectedProducts;
        private List<SigningKeyResponse> signingKeys;
        private String stepName;
        private String threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(InTotoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedCommand = defaults.expectedCommand;
    	      this.expectedMaterials = defaults.expectedMaterials;
    	      this.expectedProducts = defaults.expectedProducts;
    	      this.signingKeys = defaults.signingKeys;
    	      this.stepName = defaults.stepName;
    	      this.threshold = defaults.threshold;
        }

        public Builder expectedCommand(List<String> expectedCommand) {
            this.expectedCommand = Objects.requireNonNull(expectedCommand);
            return this;
        }

        public Builder expectedMaterials(List<ArtifactRuleResponse> expectedMaterials) {
            this.expectedMaterials = Objects.requireNonNull(expectedMaterials);
            return this;
        }

        public Builder expectedProducts(List<ArtifactRuleResponse> expectedProducts) {
            this.expectedProducts = Objects.requireNonNull(expectedProducts);
            return this;
        }

        public Builder signingKeys(List<SigningKeyResponse> signingKeys) {
            this.signingKeys = Objects.requireNonNull(signingKeys);
            return this;
        }

        public Builder stepName(String stepName) {
            this.stepName = Objects.requireNonNull(stepName);
            return this;
        }

        public Builder threshold(String threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public InTotoResponse build() {
            return new InTotoResponse(expectedCommand, expectedMaterials, expectedProducts, signingKeys, stepName, threshold);
        }
    }
}
