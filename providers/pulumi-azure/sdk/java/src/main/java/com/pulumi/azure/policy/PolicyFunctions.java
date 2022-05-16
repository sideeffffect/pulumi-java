// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.policy.inputs.GetPolicyDefintionArgs;
import com.pulumi.azure.policy.inputs.GetPolicySetDefinitionArgs;
import com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentArgs;
import com.pulumi.azure.policy.outputs.GetPolicyDefintionResult;
import com.pulumi.azure.policy.outputs.GetPolicySetDefinitionResult;
import com.pulumi.azure.policy.outputs.GetVirtualMachineConfigurationAssignmentResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class PolicyFunctions {
    /**
     * Use this data source to access information about a Policy Definition, both custom and built in. Retrieves Policy Definitions from your current subscription by default.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getPolicyDefintion(GetPolicyDefintionArgs.builder()
     *             .displayName(&#34;Allowed resource types&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getPolicyDefintionResult -&gt; getPolicyDefintionResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicyDefintionResult> getPolicyDefintion() {
        return getPolicyDefintion(GetPolicyDefintionArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about a Policy Definition, both custom and built in. Retrieves Policy Definitions from your current subscription by default.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getPolicyDefintion(GetPolicyDefintionArgs.builder()
     *             .displayName(&#34;Allowed resource types&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getPolicyDefintionResult -&gt; getPolicyDefintionResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicyDefintionResult> getPolicyDefintion(GetPolicyDefintionArgs args) {
        return getPolicyDefintion(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about a Policy Definition, both custom and built in. Retrieves Policy Definitions from your current subscription by default.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getPolicyDefintion(GetPolicyDefintionArgs.builder()
     *             .displayName(&#34;Allowed resource types&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getPolicyDefintionResult -&gt; getPolicyDefintionResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicyDefintionResult> getPolicyDefintion(GetPolicyDefintionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:policy/getPolicyDefintion:getPolicyDefintion", TypeShape.of(GetPolicyDefintionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Policy Set Definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getPolicySetDefinition(GetPolicySetDefinitionArgs.builder()
     *             .displayName(&#34;Policy Set Definition Example&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getPolicySetDefinitionResult -&gt; getPolicySetDefinitionResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicySetDefinitionResult> getPolicySetDefinition() {
        return getPolicySetDefinition(GetPolicySetDefinitionArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Policy Set Definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getPolicySetDefinition(GetPolicySetDefinitionArgs.builder()
     *             .displayName(&#34;Policy Set Definition Example&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getPolicySetDefinitionResult -&gt; getPolicySetDefinitionResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicySetDefinitionResult> getPolicySetDefinition(GetPolicySetDefinitionArgs args) {
        return getPolicySetDefinition(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Policy Set Definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getPolicySetDefinition(GetPolicySetDefinitionArgs.builder()
     *             .displayName(&#34;Policy Set Definition Example&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getPolicySetDefinitionResult -&gt; getPolicySetDefinitionResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicySetDefinitionResult> getPolicySetDefinition(GetPolicySetDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:policy/getPolicySetDefinition:getPolicySetDefinition", TypeShape.of(GetPolicySetDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Guest Configuration Policy.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getVirtualMachineConfigurationAssignment(GetVirtualMachineConfigurationAssignmentArgs.builder()
     *             .name(&#34;AzureWindowsBaseline&#34;)
     *             .resourceGroupName(&#34;example-RG&#34;)
     *             .virtualMachineName(&#34;example-vm&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;complianceStatus&#34;, example.apply(getVirtualMachineConfigurationAssignmentResult -&gt; getVirtualMachineConfigurationAssignmentResult.getComplianceStatus()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVirtualMachineConfigurationAssignmentResult> getVirtualMachineConfigurationAssignment(GetVirtualMachineConfigurationAssignmentArgs args) {
        return getVirtualMachineConfigurationAssignment(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Guest Configuration Policy.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(PolicyFunctions.getVirtualMachineConfigurationAssignment(GetVirtualMachineConfigurationAssignmentArgs.builder()
     *             .name(&#34;AzureWindowsBaseline&#34;)
     *             .resourceGroupName(&#34;example-RG&#34;)
     *             .virtualMachineName(&#34;example-vm&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;complianceStatus&#34;, example.apply(getVirtualMachineConfigurationAssignmentResult -&gt; getVirtualMachineConfigurationAssignmentResult.getComplianceStatus()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVirtualMachineConfigurationAssignmentResult> getVirtualMachineConfigurationAssignment(GetVirtualMachineConfigurationAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:policy/getVirtualMachineConfigurationAssignment:getVirtualMachineConfigurationAssignment", TypeShape.of(GetVirtualMachineConfigurationAssignmentResult.class), args, Utilities.withVersion(options));
    }
}
