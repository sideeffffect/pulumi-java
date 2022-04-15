// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackState extends io.pulumi.resources.ResourceArgs {

    public static final StackState Empty = new StackState();

    /**
     * A list of capabilities.
     * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
     * 
     */
    @Import(name="capabilities")
      private final @Nullable Output<List<String>> capabilities;

    public Output<List<String>> capabilities() {
        return this.capabilities == null ? Codegen.empty() : this.capabilities;
    }

    /**
     * Set to true to disable rollback of the stack if stack creation failed.
     * Conflicts with `on_failure`.
     * 
     */
    @Import(name="disableRollback")
      private final @Nullable Output<Boolean> disableRollback;

    public Output<Boolean> disableRollback() {
        return this.disableRollback == null ? Codegen.empty() : this.disableRollback;
    }

    /**
     * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * 
     */
    @Import(name="iamRoleArn")
      private final @Nullable Output<String> iamRoleArn;

    public Output<String> iamRoleArn() {
        return this.iamRoleArn == null ? Codegen.empty() : this.iamRoleArn;
    }

    /**
     * Stack name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of SNS topic ARNs to publish stack related events.
     * 
     */
    @Import(name="notificationArns")
      private final @Nullable Output<List<String>> notificationArns;

    public Output<List<String>> notificationArns() {
        return this.notificationArns == null ? Codegen.empty() : this.notificationArns;
    }

    /**
     * Action to be taken if stack creation fails. This must be
     * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disable_rollback`.
     * 
     */
    @Import(name="onFailure")
      private final @Nullable Output<String> onFailure;

    public Output<String> onFailure() {
        return this.onFailure == null ? Codegen.empty() : this.onFailure;
    }

    /**
     * A map of outputs from the stack.
     * 
     */
    @Import(name="outputs")
      private final @Nullable Output<Map<String,String>> outputs;

    public Output<Map<String,String>> outputs() {
        return this.outputs == null ? Codegen.empty() : this.outputs;
    }

    /**
     * A map of Parameter structures that specify input parameters for the stack.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Structure containing the stack policy body.
     * Conflicts w/ `policy_url`.
     * 
     */
    @Import(name="policyBody")
      private final @Nullable Output<String> policyBody;

    public Output<String> policyBody() {
        return this.policyBody == null ? Codegen.empty() : this.policyBody;
    }

    /**
     * Location of a file containing the stack policy.
     * Conflicts w/ `policy_body`.
     * 
     */
    @Import(name="policyUrl")
      private final @Nullable Output<String> policyUrl;

    public Output<String> policyUrl() {
        return this.policyUrl == null ? Codegen.empty() : this.policyUrl;
    }

    /**
     * Map of resource tags to associate with this stack. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Structure containing the template body (max size: 51,200 bytes).
     * 
     */
    @Import(name="templateBody")
      private final @Nullable Output<String> templateBody;

    public Output<String> templateBody() {
        return this.templateBody == null ? Codegen.empty() : this.templateBody;
    }

    /**
     * Location of a file containing the template body (max size: 460,800 bytes).
     * 
     */
    @Import(name="templateUrl")
      private final @Nullable Output<String> templateUrl;

    public Output<String> templateUrl() {
        return this.templateUrl == null ? Codegen.empty() : this.templateUrl;
    }

    /**
     * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
     * 
     */
    @Import(name="timeoutInMinutes")
      private final @Nullable Output<Integer> timeoutInMinutes;

    public Output<Integer> timeoutInMinutes() {
        return this.timeoutInMinutes == null ? Codegen.empty() : this.timeoutInMinutes;
    }

    public StackState(
        @Nullable Output<List<String>> capabilities,
        @Nullable Output<Boolean> disableRollback,
        @Nullable Output<String> iamRoleArn,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> notificationArns,
        @Nullable Output<String> onFailure,
        @Nullable Output<Map<String,String>> outputs,
        @Nullable Output<Map<String,String>> parameters,
        @Nullable Output<String> policyBody,
        @Nullable Output<String> policyUrl,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> templateBody,
        @Nullable Output<String> templateUrl,
        @Nullable Output<Integer> timeoutInMinutes) {
        this.capabilities = capabilities;
        this.disableRollback = disableRollback;
        this.iamRoleArn = iamRoleArn;
        this.name = name;
        this.notificationArns = notificationArns;
        this.onFailure = onFailure;
        this.outputs = outputs;
        this.parameters = parameters;
        this.policyBody = policyBody;
        this.policyUrl = policyUrl;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.templateBody = templateBody;
        this.templateUrl = templateUrl;
        this.timeoutInMinutes = timeoutInMinutes;
    }

    private StackState() {
        this.capabilities = Codegen.empty();
        this.disableRollback = Codegen.empty();
        this.iamRoleArn = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationArns = Codegen.empty();
        this.onFailure = Codegen.empty();
        this.outputs = Codegen.empty();
        this.parameters = Codegen.empty();
        this.policyBody = Codegen.empty();
        this.policyUrl = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.templateBody = Codegen.empty();
        this.templateUrl = Codegen.empty();
        this.timeoutInMinutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> capabilities;
        private @Nullable Output<Boolean> disableRollback;
        private @Nullable Output<String> iamRoleArn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> notificationArns;
        private @Nullable Output<String> onFailure;
        private @Nullable Output<Map<String,String>> outputs;
        private @Nullable Output<Map<String,String>> parameters;
        private @Nullable Output<String> policyBody;
        private @Nullable Output<String> policyUrl;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> templateBody;
        private @Nullable Output<String> templateUrl;
        private @Nullable Output<Integer> timeoutInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(StackState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.disableRollback = defaults.disableRollback;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.name = defaults.name;
    	      this.notificationArns = defaults.notificationArns;
    	      this.onFailure = defaults.onFailure;
    	      this.outputs = defaults.outputs;
    	      this.parameters = defaults.parameters;
    	      this.policyBody = defaults.policyBody;
    	      this.policyUrl = defaults.policyUrl;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.templateBody = defaults.templateBody;
    	      this.templateUrl = defaults.templateUrl;
    	      this.timeoutInMinutes = defaults.timeoutInMinutes;
        }

        public Builder capabilities(@Nullable Output<List<String>> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(@Nullable List<String> capabilities) {
            this.capabilities = Codegen.ofNullable(capabilities);
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder disableRollback(@Nullable Output<Boolean> disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }
        public Builder disableRollback(@Nullable Boolean disableRollback) {
            this.disableRollback = Codegen.ofNullable(disableRollback);
            return this;
        }
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }
        public Builder iamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Codegen.ofNullable(iamRoleArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notificationArns(@Nullable Output<List<String>> notificationArns) {
            this.notificationArns = notificationArns;
            return this;
        }
        public Builder notificationArns(@Nullable List<String> notificationArns) {
            this.notificationArns = Codegen.ofNullable(notificationArns);
            return this;
        }
        public Builder notificationArns(String... notificationArns) {
            return notificationArns(List.of(notificationArns));
        }
        public Builder onFailure(@Nullable Output<String> onFailure) {
            this.onFailure = onFailure;
            return this;
        }
        public Builder onFailure(@Nullable String onFailure) {
            this.onFailure = Codegen.ofNullable(onFailure);
            return this;
        }
        public Builder outputs(@Nullable Output<Map<String,String>> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(@Nullable Map<String,String> outputs) {
            this.outputs = Codegen.ofNullable(outputs);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder policyBody(@Nullable Output<String> policyBody) {
            this.policyBody = policyBody;
            return this;
        }
        public Builder policyBody(@Nullable String policyBody) {
            this.policyBody = Codegen.ofNullable(policyBody);
            return this;
        }
        public Builder policyUrl(@Nullable Output<String> policyUrl) {
            this.policyUrl = policyUrl;
            return this;
        }
        public Builder policyUrl(@Nullable String policyUrl) {
            this.policyUrl = Codegen.ofNullable(policyUrl);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder templateBody(@Nullable Output<String> templateBody) {
            this.templateBody = templateBody;
            return this;
        }
        public Builder templateBody(@Nullable String templateBody) {
            this.templateBody = Codegen.ofNullable(templateBody);
            return this;
        }
        public Builder templateUrl(@Nullable Output<String> templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public Builder templateUrl(@Nullable String templateUrl) {
            this.templateUrl = Codegen.ofNullable(templateUrl);
            return this;
        }
        public Builder timeoutInMinutes(@Nullable Output<Integer> timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Builder timeoutInMinutes(@Nullable Integer timeoutInMinutes) {
            this.timeoutInMinutes = Codegen.ofNullable(timeoutInMinutes);
            return this;
        }        public StackState build() {
            return new StackState(capabilities, disableRollback, iamRoleArn, name, notificationArns, onFailure, outputs, parameters, policyBody, policyUrl, tags, tagsAll, templateBody, templateUrl, timeoutInMinutes);
        }
    }
}
