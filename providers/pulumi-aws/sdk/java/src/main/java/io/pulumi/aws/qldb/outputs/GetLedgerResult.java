// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.qldb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLedgerResult {
    private final String arn;
    private final Boolean deletionProtection;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String permissionsMode;

    @OutputCustomType.Constructor
    private GetLedgerResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("deletionProtection") Boolean deletionProtection,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("permissionsMode") String permissionsMode) {
        this.arn = arn;
        this.deletionProtection = deletionProtection;
        this.id = id;
        this.name = name;
        this.permissionsMode = permissionsMode;
    }

    public String getArn() {
        return this.arn;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getPermissionsMode() {
        return this.permissionsMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLedgerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean deletionProtection;
        private String id;
        private String name;
        private String permissionsMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLedgerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissionsMode = defaults.permissionsMode;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder permissionsMode(String permissionsMode) {
            this.permissionsMode = Objects.requireNonNull(permissionsMode);
            return this;
        }
        public GetLedgerResult build() {
            return new GetLedgerResult(arn, deletionProtection, id, name, permissionsMode);
        }
    }
}
