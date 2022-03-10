// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs();

    /**
     * Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
     * or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs(name);
        }
    }
}
